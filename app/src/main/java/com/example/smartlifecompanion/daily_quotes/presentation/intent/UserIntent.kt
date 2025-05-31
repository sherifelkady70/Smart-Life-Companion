package com.example.smartlifecompanion.daily_quotes.presentation.intent

sealed class UserIntent{
    data object FetchQuotes  : UserIntent()
}


//sealed class SideEffects{
//    data class ShowQuote(val quote : String) : SideEffects()
//}


sealed class UiState{
    data object Loading : UiState()
    data object Idle : UiState()
    data class Success(val quote : String) : UiState()
}