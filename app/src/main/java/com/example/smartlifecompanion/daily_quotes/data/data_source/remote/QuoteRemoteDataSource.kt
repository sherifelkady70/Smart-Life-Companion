package com.example.smartlifecompanion.daily_quotes.data.data_source.remote

import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel

interface QuoteRemoteDataSource {
    suspend fun getQuote() : QuoteModel
}