package com.example.smartlifecompanion.weather.presentation.view.components

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun WeatherCardView(
    backBtnClick: () -> Unit,
    townName: String,
    temperature: String,
    temperatureState: String,
    iconUrl: String
) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        colors = CardDefaults.cardColors(Color(0xFFF0F4F7)),
        elevation = CardDefaults.cardElevation(12.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        WeatherTitle(backBtnClick)
        WeatherCardContent(
            townName = townName,
            temperature = temperature,
            temperatureState = temperatureState,
            iconUrl = iconUrl
        )
    }
}