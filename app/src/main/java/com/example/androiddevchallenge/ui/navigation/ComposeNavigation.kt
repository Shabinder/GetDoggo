package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.ui.screens.HomeScreen
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.ui.screens.DetailScreen

@Composable
fun ComposeNavigation(
    navController: NavHostController,
){
    NavHost(
        navController,
        startDestination = "home",
    ) {
        //HomeScreen - Starting Point
        composable("home") {
            HomeScreen{
                navController.navigate("details/$it")
            }
        }

        //Details Screen
        //Argument `index` = index of Doggo List
        composable (
            "details/{index}",
            arguments = listOf(navArgument("index") { type = NavType.StringType })
        ) {
            DetailScreen(
                it.arguments?.getString("index") ?: "error",
                navController.navigate("home") {
                    launchSingleTop = true
                    popUpTo(route = "home"){}
                }
            )
        }
    }
}