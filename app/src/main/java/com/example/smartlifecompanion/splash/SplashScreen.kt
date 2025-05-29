package com.example.smartlifecompanion.splash

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        Log.d("TAG","Splash")
        delay(3000)
        navController.navigate("Home"){
            popUpTo("SplashScreen") { inclusive = true }
        }
    }
    Log.d("TAG","Splash")
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
    ) {
        Text(text = "Smart Life Companion", color = Color.Black
            , modifier = Modifier.align(Alignment.Center) ,
            fontSize = 28.sp , fontStyle = FontStyle.Italic)
    }
}
