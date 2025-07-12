package com.example.daily_quotes.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlifecompanion.daily_quotes.domain.usecase.DailyQuoteUseCase
import com.example.daily_quotes.presentation.intent.SideEffects
import com.example.daily_quotes.presentation.intent.UiState
import com.example.daily_quotes.presentation.intent.UserIntent
import com.example.smartlifecompanion.utilits.NetworkStateResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DailyQuotesViewModel @Inject constructor(
    private val getQuoteUseCase: DailyQuoteUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    private val _sideEffects: Channel<SideEffects> = Channel()
    val sideEffects = _sideEffects.receiveAsFlow()

    init {
        processIntent(UserIntent.FetchQuotes)
    }

    fun processIntent(userAction: UserIntent) {
        when (userAction) {
            is UserIntent.FetchQuotes -> {
                getQuote()
            }
        }
    }

    private fun sendOutput(action: () -> SideEffects) {
        viewModelScope.launch {
            _sideEffects.send(action())
        }
    }

    private fun getQuote() {
        viewModelScope.launch(Dispatchers.IO) {
            getQuoteUseCase.invoke().collect { resource ->
                when (resource) {
                    is NetworkStateResource.Loading -> {
                        _uiState.update { it.copy(isLoading = true) }
                    }

                    is NetworkStateResource.Error -> {
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                errorMessage = resource.message
                            )
                        }
                        sendOutput { SideEffects.ShowToastError(resource.message) }
                    }

                    is NetworkStateResource.Success -> {
                        Log.d("TAG", resource.data.quote)
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                quote = resource.data.quote,
                                authorName = resource.data.authorName
                            )
                        }
                    }
                }
            }
        }
    }
}
