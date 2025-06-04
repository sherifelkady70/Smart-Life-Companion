package com.example.smartlifecompanion.daily_quotes.domain.usecase

import android.util.Log
import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponse
import com.example.smartlifecompanion.daily_quotes.data.model.QuoteResponseItem
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import com.example.smartlifecompanion.daily_quotes.utilits.NetworkStateResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class DailyQuoteUseCase @Inject constructor(
    private val repo: DailyQuoteRepository
) {
     operator fun invoke(): Flow<NetworkStateResource<List<QuoteResponseItem>>>  = flow {
          emit(NetworkStateResource.Loading)
         try {
             repo.getQuote().collect{
                 emit(NetworkStateResource.Success(it))
             }
         }
         catch (e:Exception){
             emit(NetworkStateResource.Error(e.localizedMessage ?: "Error"))
         }
     }

}




