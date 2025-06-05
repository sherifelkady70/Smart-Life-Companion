package com.example.smartlifecompanion.daily_quotes.presentation.intent

sealed class UserIntent{
    data object FetchQuotes  : UserIntent()
}


sealed class SideEffects{
    data class ShowToastError(val message : String) : SideEffects()
}


data class UiState(
    var isLoading : Boolean = false,
    var quote : String = "sasas",
    var errorMessage : String = "",
    var authorName : String = ""
)