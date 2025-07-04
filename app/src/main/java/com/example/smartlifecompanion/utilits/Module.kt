package com.example.smartlifecompanion.utilits

import com.example.smartlifecompanion.daily_quotes.data.data_source.remote.QuoteRemoteDataSource
import com.example.smartlifecompanion.daily_quotes.data.data_source.remote.QuoteRemoteDataSourceImpl
import com.example.smartlifecompanion.daily_quotes.data.repositoryImpl.DailyQuoteRepositoryImpl
import com.example.smartlifecompanion.daily_quotes.data.service.DailyQuotesService
import com.example.smartlifecompanion.daily_quotes.domain.repository.DailyQuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY // or HEADERS/BASIC/NONE
        }
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }
    @Provides
    @Singleton
    fun provideQuoteService(okHttpClient: OkHttpClient) : DailyQuotesService {
        return Retrofit.Builder()
            .baseUrl("https://zenquotes.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(DailyQuotesService::class.java)
    }

    @Provides
    fun provideDailyQuoteRepository(quoteRemoteDataSource: QuoteRemoteDataSource) : DailyQuoteRepository {
        return DailyQuoteRepositoryImpl(quoteRemoteDataSource)
    }


    @Provides
    fun provideDailyQuoteRemoteDataSource(apiService: DailyQuotesService) : QuoteRemoteDataSource {
        return QuoteRemoteDataSourceImpl(apiService)
    }
}