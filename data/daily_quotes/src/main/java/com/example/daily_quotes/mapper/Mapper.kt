package com.example.daily_quotes.mapper

import com.example.daily_quotes.domain.model.QuoteModel


object QuoteMapper{
    fun toDomainModel(quote : String , authorName : String) : QuoteModel{
        return QuoteModel(quote,authorName)
    }
}