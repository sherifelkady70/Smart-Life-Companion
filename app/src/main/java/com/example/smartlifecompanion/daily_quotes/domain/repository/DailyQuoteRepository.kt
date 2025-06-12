package com.example.smartlifecompanion.daily_quotes.domain.repository

import com.example.smartlifecompanion.daily_quotes.data.model.response.QuoteResponseItem
import kotlinx.coroutines.flow.Flow

interface DailyQuoteRepository {
     fun getQuote() : Flow<List<QuoteResponseItem>>
}