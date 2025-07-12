package com.example.daily_quotes.dao

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface QuoteDao {

    @Insert
    suspend fun insert()

    suspend fun getQuotes()
}