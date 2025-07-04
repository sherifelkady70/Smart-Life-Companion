package com.example.smartlifecompanion.daily_quotes.data.data_source.remote

import com.example.smartlifecompanion.daily_quotes.data.mapper.QuoteMapper
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.model.QuoteModel
import javax.inject.Inject

class QuoteRemoteDataSourceImpl @Inject constructor(val apiService: DailyQuotesService) :
    QuoteRemoteDataSource {
    override suspend fun getQuote(): QuoteModel {
        val response = apiService.getQuote()[0]
        return QuoteMapper.toDomainModel(response.q!!,response.a!!)
    }
}