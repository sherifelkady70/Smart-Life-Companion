package com.example.smartlifecompanion.daily_quotes.presentation.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.smartlifecompanion.daily_quotes.presentation.intent.SideEffects
import com.example.smartlifecompanion.daily_quotes.presentation.intent.UiState
import com.example.smartlifecompanion.daily_quotes.presentation.viewmodel.DailyQuotesViewModel

@Composable
fun DailyQuotesScreen(viewModel: DailyQuotesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    LaunchedEffect(Unit) {
        viewModel.sideEffects.collect { side ->
            when (side) {
                is SideEffects.ShowToastError -> {
                    Toast.makeText(context, side.message, Toast.LENGTH_SHORT)
                }
            }
        }
    }

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
        DailyQuoteContent(state)
    }
}


@Composable
fun DailyQuoteContent(state: UiState) {
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                "${state.quote} ", fontSize = 18.sp,
                modifier = Modifier.align(Alignment.CenterVertically),
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                "  - ${state.authorName} -  ", fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                color = Color.Black
            )
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DailyQuotesScreenPreview() {
    DailyQuotesScreen()
}