package com.example.smartlifecompanion.daily_quotes.data.dao

import androidx.room.Dao

@Dao
interface QuoteDao {

    suspend fun insert()
}