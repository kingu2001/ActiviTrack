package com.example.myapplication.ViewModel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.View.HomeScreen
import com.example.myapplication.View.StartScreen

@Composable
fun Controller(navController : NavHostController = rememberNavController()) {

    NavHost(navController = navController, startDestination = "startScreen") {
        composable("startScreen") {
            StartScreen {
                navController.navigate("homeScreen")
            }
        }

        composable("homeScreen"){
            HomeScreen()
        }
    }
}