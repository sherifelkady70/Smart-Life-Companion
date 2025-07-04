package com.example.smartlifecompanion.daily_quotes.data.repositoryImpl

import com.example.smartlifecompanion.daily_quotes.data.DTO.response.QuoteDTO
import com.example.smartlifecompanion.daily_quotes.data.mapper.QuoteMapper
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DailyQuoteRepositoryImpl @Inject constructor(
    private val apiService: DailyQuotesService
) : DailyQuoteRepository {
    override suspend fun getQuote(): Flow<QuoteModel> {
        val apiCall = apiService.getQuote()
        val quote =  QuoteMapper.toDomainModel(
            apiCall[0].q.toString(),
            apiCall[0].a.toString()
        )
        return flow {
            emit(quote)
        }
    }
}