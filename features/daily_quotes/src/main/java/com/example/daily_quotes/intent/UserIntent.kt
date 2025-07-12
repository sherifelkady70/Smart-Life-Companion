package com.example.daily_quotes.intent

sealed class UserIntent{
    data object FetchQuotes  : UserIntent()
}


sealed class SideEffects{
    data class ShowToastError(val message : String) : SideEffects()
}


data class UiState(
    var isLoading : Boolean = false,
    var quote : String = "",
    var errorMessage : String = "",
    var authorName : String = ""
)