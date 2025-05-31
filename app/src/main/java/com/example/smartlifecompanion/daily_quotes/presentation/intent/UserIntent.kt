package com.example.smartlifecompanion.daily_quotes.presentation.intent

sealed class Intent{
    data object FetchQuotes  : Intent()
}


//sealed class SideEffects{
//    data class ShowQuote(val quote : String) : SideEffects()
//}


sealed class UiState{
    data object Loading : UiState()
    data object Idle : UiState()
    data class Success(val quote : String) : UiState()
}