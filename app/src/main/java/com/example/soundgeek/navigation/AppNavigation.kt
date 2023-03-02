package com.example.soundgeek.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.soundgeek.index.Index
import com.example.soundgeek.login.Login

@Composable
fun AppNavigation() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = AppScreens.Login.route) {
        composable(AppScreens.Login.route) { Login(navigationController) }
        composable(AppScreens.Index.route) { Index(navigationController) }
    }

}