package com.example.smartlifecompanion.daily_quotes.data.service

import com.example.smartlifecompanion.daily_quotes.data.model.response.QuoteResponseItem
import retrofit2.http.GET

interface DailyQuotesService {
    @GET("today")
    suspend fun getQuote() : List<QuoteResponseItem>
}