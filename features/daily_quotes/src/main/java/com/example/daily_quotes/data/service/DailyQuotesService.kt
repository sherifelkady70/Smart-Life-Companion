package com.example.daily_quotes.data.service

import com.example.smartlifecompanion.daily_quotes.data.DTO.response.QuoteDTO
import retrofit2.http.GET

interface DailyQuotesService {
    @GET("today")
    suspend fun getQuote() : List<QuoteDTO>
}