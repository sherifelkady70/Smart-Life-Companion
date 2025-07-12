package com.example.daily_quotes.view.screen

import android.widget.Toast
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daily_quotes.intent.SideEffects
import com.example.daily_quotes.view.components.QuoteAndAuthorView
import com.example.daily_quotes.viewmodel.DailyQuotesViewModel
import org.w3c.dom.Text


@Composable
fun DailyQuotesScreen(viewModel: DailyQuotesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    LaunchedEffect(Unit) {
        viewModel.sideEffects.collect { side ->
            when (side) {
                is SideEffects.ShowToastError -> {
                    Toast.makeText(context, side.message, Toast.LENGTH_SHORT).show()
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
        QuoteAndAuthorView(state)
    }
}
