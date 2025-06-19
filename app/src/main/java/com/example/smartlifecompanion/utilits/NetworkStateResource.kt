package com.example.smartlifecompanion.utilits

sealed class NetworkStateResource<out T>{
    data class Success<out T>(val data : T) : NetworkStateResource<T>()
    data class Error(val message : String) : NetworkStateResource<Nothing>()
    object Loading : NetworkStateResource<Nothing>()
}