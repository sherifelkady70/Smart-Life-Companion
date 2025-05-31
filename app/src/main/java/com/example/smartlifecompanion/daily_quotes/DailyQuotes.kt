package com.example.smartlifecompanion.daily_quotes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DailyQuotes(){
    Box(Modifier.fillMaxSize().padding(top = 50.dp)) {
        Text("Daily Quotes", fontSize = 34.sp ,
            modifier = Modifier.align(Alignment.TopCenter),
            fontStyle = FontStyle.Normal )

        Text("Daily Quotes", fontSize = 24.sp ,
            modifier = Modifier.align(Alignment.Center),
            fontStyle = FontStyle.Normal )
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DailyQuotesScreenPreview(){
    DailyQuotes()
}