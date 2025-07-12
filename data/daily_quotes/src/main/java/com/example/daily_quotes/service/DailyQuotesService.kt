package com.example.daily_quotes.service

import com.example.daily_quotes.DTO.response.QuoteDTO
import retrofit2.http.GET

interface DailyQuotesService {
    @GET("today")
    suspend fun getQuote() : List<QuoteDTO>
}