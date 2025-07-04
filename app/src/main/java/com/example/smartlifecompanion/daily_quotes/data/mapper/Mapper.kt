package com.example.smartlifecompanion.daily_quotes.data.mapper

import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel

object QuoteMapper{
    fun toDomainModel(quote : String , authorName : String) : QuoteModel{
        return QuoteModel(quote,authorName)
    }
}