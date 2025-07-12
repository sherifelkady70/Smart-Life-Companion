package com.example.daily_quotes.data.dao

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface QuoteDao {

    @Insert
    suspend fun insert()

    suspend fun getQuotes()
}