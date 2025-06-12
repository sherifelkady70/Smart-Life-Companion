package com.example.smartlifecompanion.daily_quotes.data.repositoryImpl

import com.example.smartlifecompanion.daily_quotes.data.model.response.QuoteResponseItem
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DailyQuoteRepositoryImpl @Inject constructor(
    private val apiService: DailyQuotesService
) : DailyQuoteRepository {
    override  fun getQuote(): Flow<List<QuoteResponseItem>> {
        return flow {
            emit(apiService.getQuote())
        }
    }
}