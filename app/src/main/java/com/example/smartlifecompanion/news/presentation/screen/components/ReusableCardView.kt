package com.example.smartlifecompanion.news.presentation.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ReusableCardView(text : String){
    Spacer(Modifier.padding(20.dp))
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(26.dp)
        ) {
            Text(text = text,
                style = MaterialTheme.typography.titleMedium ,
                fontSize = 18.sp
            )
        }
    }
}



@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewCard(){
    ReusableCardView("Business")
}