package com.example.daily_quotes.data_source.remote

import com.example.daily_quotes.mapper.QuoteMapper
import com.example.daily_quotes.service.DailyQuotesService
import com.example.daily_quotes.domain.model.QuoteModel
import javax.inject.Inject

class QuoteRemoteDataSourceImpl @Inject constructor(val apiService: DailyQuotesService) :
    QuoteRemoteDataSource {
    override suspend fun getQuote(): QuoteModel {
        val response = apiService.getQuote()[0]
        return QuoteMapper.toDomainModel(response.q!!,response.a!!)
    }
}