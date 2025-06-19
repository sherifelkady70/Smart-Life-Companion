package com.example.smartlifecompanion.daily_quotes.domain.usecase

import com.example.smartlifecompanion.daily_quotes.data.model.response.QuoteResponseItem
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import com.example.smartlifecompanion.utilits.NetworkStateResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
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




