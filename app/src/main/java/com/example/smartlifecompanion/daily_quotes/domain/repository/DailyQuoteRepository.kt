package com.example.smartlifecompanion.daily_quotes.domain.repository

import com.example.smartlifecompanion.daily_quotes.data.DTO.response.QuoteDTO
import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow

interface DailyQuoteRepository {
     suspend fun getQuote() : Flow<QuoteModel>
}