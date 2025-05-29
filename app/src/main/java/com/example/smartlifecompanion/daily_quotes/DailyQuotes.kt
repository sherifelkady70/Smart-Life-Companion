package com.example.smartlifecompanion.daily_quotes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DailyQuotes(){
    Box(Modifier.fillMaxSize()) {
        Text("Daily Quotes", fontSize = 24.sp , modifier = Modifier.align(Alignment.Center))
    }
}