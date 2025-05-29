package com.example.smartlifecompanion.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Box(Modifier.fillMaxSize()){
        Text("Home", fontSize = 24.sp)
    }
}