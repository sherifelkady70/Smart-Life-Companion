package com.example.daily_quotes.data.repositoryImpl

import com.example.smartlifecompanion.daily_quotes.data.DTO.response.QuoteDTO
import com.example.smartlifecompanion.daily_quotes.data.data_source.remote.QuoteRemoteDataSource
import com.example.smartlifecompanion.daily_quotes.data.mapper.QuoteMapper
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DailyQuoteRepositoryImpl @Inject constructor(
    private val quoteRemoteDataSource: QuoteRemoteDataSource
) : DailyQuoteRepository {
    override suspend fun getQuote(): Flow<QuoteModel> {
        return flow {
            emit(quoteRemoteDataSource.getQuote())
        }
    }
}