package com.example.smartlifecompanion.daily_quotes.data.repositoryImpl

import android.util.Log
import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponse
import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponseItem
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import com.example.smartlifecompanion.daily_quotes.utilits.NetworkStateResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
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