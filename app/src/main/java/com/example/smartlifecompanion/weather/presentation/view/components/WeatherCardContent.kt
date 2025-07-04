package com.example.smartlifecompanion.weather.presentation.view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun WeatherCardContent(
    townName : String,
    temperature : String,
    temperatureState : String,
    iconUrl : String
){

    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(townName, fontSize = 44.sp,
            fontWeight = FontWeight.Medium)
        Spacer(Modifier.padding(10.dp))

        AsyncImage(
            model = iconUrl,
            contentDescription = "Weather Icon",
            modifier = Modifier.size(100.dp)
        )
        Spacer(Modifier.padding(10.dp))

        Text(temperature, fontSize = 44.sp,
            fontWeight = FontWeight.Medium)


        Text(temperatureState, fontSize = 28.sp,
            fontWeight = FontWeight.Normal)
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun pre(){
//    WeatherCardContent()
}