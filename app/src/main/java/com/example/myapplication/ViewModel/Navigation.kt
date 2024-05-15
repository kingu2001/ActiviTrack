package com.example.myapplication.ViewModel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.navArgument
import com.example.myapplication.View.AddEditDetailView
import com.example.myapplication.View.HomeScreen
import com.example.myapplication.View.Screen
import com.example.myapplication.View.StartScreen

@Composable
fun Navigation(viewModel: ActivityViewModel = viewModel(), navController: NavHostController = rememberNavController()
) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        /*composable(Screen.StartScreen.route) {
            StartScreen {
                navController.navigate(Screen.HomeScreen.route)
            }
        }*/

        composable(Screen.HomeScreen.route) {
            HomeScreen(navController, viewModel)
        }

        composable(Screen.AddScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.IntType
                    defaultValue = 0
                    nullable = false
                })
            ){
            entry -> val id = if(entry.arguments != null) entry.arguments!!.getInt("id") else 0
            AddEditDetailView(id = id, viewModel = viewModel, navController = navController)
        }
    }
}


