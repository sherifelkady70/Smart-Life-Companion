package com.example.daily_quotes.repositoryImpl

import com.example.daily_quotes.data_source.remote.QuoteRemoteDataSource
import com.example.daily_quotes.domain.model.QuoteModel
import com.example.daily_quotes.domain.repository.DailyQuoteRepository
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