package com.example.daily_quotes.data_source.remote

import com.example.daily_quotes.domain.model.QuoteModel

interface QuoteRemoteDataSource {
    suspend fun getQuote() : QuoteModel
}