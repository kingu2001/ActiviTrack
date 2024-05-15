package com.example.myapplication.View

sealed class Screen(val route : String) {
    object HomeScreen : Screen("home_screen")
    object AddScreen : Screen("add_screen")

    object StartScreen : Screen("start_screen")
}