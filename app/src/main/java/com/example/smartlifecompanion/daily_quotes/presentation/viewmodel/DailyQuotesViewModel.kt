package com.example.smartlifecompanion.daily_quotes.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.smartlifecompanion.daily_quotes.presentation.intent.Intent
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DailyQuotesViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle)
    val uiState = _uiState.asStateFlow()
    
    init {

    }

    fun processIntent(intent: Intent){
        when(intent){
            Intent.FetchQuotes ->{

            }
        }
    }
}