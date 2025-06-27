package com.example.smartlifecompanion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartlifecompanion.daily_quotes.presentation.view.screen.DailyQuotesScreen
import com.example.smartlifecompanion.home.HomeScreen
import com.example.smartlifecompanion.splash.SplashScreen
import com.example.smartlifecompanion.weather.presentation.view.screen.WeatherScreen

@Composable
fun MyAppNavigation(){
    val navController = rememberNavController()
    NavHost (navController = navController , startDestination = "SplashScreen"){
        composable("SplashScreen") { SplashScreen(navController) }
        composable("Home") { HomeScreen(navController) }
        composable("DailyQuotes") { DailyQuotesScreen() }
        composable("Weather") { WeatherScreen(navController) }
    }
}