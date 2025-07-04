package com.example.smartlifecompanion.weather.presentation.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smartlifecompanion.weather.presentation.view.components.WeatherCardView

@Composable
fun WeatherScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()
        .padding(28.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        WeatherCardView(backBtnClick = {navController.popBackStack()},
            townName = "Cairo", temperature = "32 C",
            temperatureState = "sunny",
            iconUrl = "")
    }
}




//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun pre(){
//    WeatherScreen()
//}