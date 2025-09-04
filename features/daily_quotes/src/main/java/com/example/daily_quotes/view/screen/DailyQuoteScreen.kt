package com.example.daily_quotes.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daily_quotes.intent.UserIntent
import com.example.daily_quotes.view.components.ErrorScreen
import com.example.daily_quotes.view.components.QuoteAndAuthorView
import com.example.daily_quotes.viewmodel.DailyQuotesViewModel


@Composable
fun DailyQuotesScreen(viewModel: DailyQuotesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsState()
    when {
        state.isLoading -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CircularProgressIndicator()
            }
        }
        state.errorMessage !=null -> {
            ErrorScreen(state.errorMessage){
                viewModel.processIntent(UserIntent.Retry)
            }
        }
        else -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 150.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(text = "Quote of the Day", fontSize = 24.sp,
                    fontFamily = FontFamily.Serif ,
                    fontStyle = FontStyle.Normal,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(modifier = Modifier.padding(20.dp))
                QuoteAndAuthorView(state)
            }
        }
    }

}
