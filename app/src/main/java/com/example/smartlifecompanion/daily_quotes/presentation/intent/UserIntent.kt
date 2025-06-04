package com.example.smartlifecompanion.daily_quotes.presentation.intent

sealed class UserIntent{
    data object FetchQuotes  : UserIntent()
}


sealed class SideEffects{
    data class ShowQuote(val quote : String) : SideEffects()
    data class ShowErrorQuote(val message : String) : SideEffects()
}


data class UiState(
    var isLoading : Boolean = false,
    var quote : String = "sasas",
    var errorMessage : String = ""
)