package com.example.smartlifecompanion.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.smartlifecompanion.R

@Composable
fun HomeScreen(navController:NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.padding(50.dp))
        CardClick(navController,ServiceTypes.DAILY_QUOTES)
        CardClick(navController,ServiceTypes.NEWS)
    }
}

@Composable
fun CardClick(navController:NavController,featureTypes: ServiceTypes) {
    when(featureTypes){
        ServiceTypes.DAILY_QUOTES ->{
            Card(stringResource(R.string.daily_quotes)) {
                navController.navigate("DailyQuotes")
            }
        }
        ServiceTypes.NEWS ->{
            Card(stringResource(R.string.news)) { }
        }
    }

}

@Composable
fun Card(featureName : String , onClick : ()->Unit){
    Card(
        shape = RoundedCornerShape(0.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(color = Color.LightGray)
            .border(border = BorderStroke(2.dp, color = Color.Black)
                , shape = RoundedCornerShape(8.dp))
            .clickable { onClick() },
    ) {
        Row(Modifier.fillMaxWidth()) {
            Text(
                featureName,
                fontSize = 18.sp, color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(vertical = 18.dp , horizontal = 10.dp)
            )
        }
    }
}
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomePreview() {
//    HomeScreen()
}