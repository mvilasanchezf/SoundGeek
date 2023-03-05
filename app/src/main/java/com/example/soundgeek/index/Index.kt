package com.example.soundgeek.index

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.soundgeek.ui.GameScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Index(navController: NavController) {

    //Invocamos a la pantalla de juego
    GameScreen()

}
