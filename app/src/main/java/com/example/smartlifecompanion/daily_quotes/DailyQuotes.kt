package com.example.smartlifecompanion.daily_quotes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UiState
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UserIntent
import com.example.smartlifecompanion.daily_quotes.presentation.viewmodel.DailyQuotesViewModel

@Composable
fun DailyQuotes(viewModel: DailyQuotesViewModel = viewModel()){
    val state by viewModel.uiState.collectAsState()
    Box(Modifier.fillMaxSize().padding(top = 50.dp)) {
        Text("Daily Quotes", fontSize = 34.sp ,
            modifier = Modifier.align(Alignment.TopCenter),
            fontStyle = FontStyle.Normal )

        when(state){
            is UiState.Idle -> {
                viewModel.processIntent(UserIntent.FetchQuotes)
            }
            is UiState.Loading -> {

            }
            is UiState.Success ->{
                Text((state as UiState.Success).quote, fontSize = 24.sp ,
                    modifier = Modifier.align(Alignment.Center),
                    fontStyle = FontStyle.Normal )
            }
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DailyQuotesScreenPreview(){
    //DailyQuotes()
}