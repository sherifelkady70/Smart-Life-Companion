package com.example.smartlifecompanion.daily_quotes.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UserIntent
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DailyQuotesViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle)
    val uiState = _uiState.asStateFlow()
    
    init {

    }

    fun processIntent(userIntent: UserIntent){
        when(userIntent){
            UserIntent.FetchQuotes ->{
                viewModelScope.launch {
                    _uiState.value = UiState.Loading

                }
            }
        }
    }
}