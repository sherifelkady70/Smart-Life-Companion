package com.example.smartlifecompanion.weather.presentation.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WeatherScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize()
        .padding(28.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        WeatherCardView(backBtnClick = {navController.popBackStack()})
    }
}

@Composable
fun WeatherCardView(backBtnClick: () -> Unit){
    Card(modifier = Modifier.fillMaxSize()
        .padding(18.dp),
        colors = CardDefaults.cardColors(Color(0xFFF0F4F7))
        ,elevation = CardDefaults.cardElevation(12.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        WeatherTitle(backBtnClick)
    }
}

@Composable
fun WeatherTitle(
    backBtnClick : () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        IconButton(
            onClick = backBtnClick
        ) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "Back",
                tint = Color.Black
            )
        }
        Text(modifier = Modifier.padding(10.dp).align(Alignment.Center),
            style = MaterialTheme.typography.titleMedium,
            text = "Weather", fontSize = 22.sp,
        )
    }
}


//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun pre(){
//    WeatherScreen()
//}