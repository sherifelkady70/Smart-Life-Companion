package com.example.daily_quotes.view.components

import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daily_quotes.intent.UiState
import com.example.daily_quotes.view.screen.DailyQuotesScreen
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun QuoteAndAuthorView(state: UiState) {
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