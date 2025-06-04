package com.example.smartlifecompanion.daily_quotes.domain.repository

import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponse
import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponseItem
import com.example.smartlifecompanion.daily_quotes.utilits.NetworkStateResource
import kotlinx.coroutines.flow.Flow

interface DailyQuoteRepository {
     fun getQuote() : Flow<List<QuoteResponseItem>>
}