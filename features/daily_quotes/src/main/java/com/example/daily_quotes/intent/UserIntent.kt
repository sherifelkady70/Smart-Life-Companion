package com.example.daily_quotes.intent

sealed class UserIntent{
    data object FetchQuotes  : UserIntent()
    data object Retry : UserIntent()
}



data class UiState(
    var isLoading : Boolean = false,
    var quote : String = "",
    var errorMessage : String? = null,
    var authorName : String = ""
)