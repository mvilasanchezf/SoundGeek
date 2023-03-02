package com.example.soundgeek.navigation

sealed class AppScreens (val route: String){

    object Login: AppScreens("login")
    object Index: AppScreens("index")
}