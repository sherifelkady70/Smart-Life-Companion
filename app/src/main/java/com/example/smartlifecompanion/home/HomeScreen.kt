package com.example.smartlifecompanion.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smartlifecompanion.home.components.CardClick

@Composable
fun HomeScreen(navController:NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.padding(50.dp))
        CardClick(navController,ServiceTypes.DAILY_QUOTES)
        CardClick(navController,ServiceTypes.NEWS)
        CardClick(navController,ServiceTypes.WEATHER)
        CardClick(navController,ServiceTypes.MAP)
    }
}
