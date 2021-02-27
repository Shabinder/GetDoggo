package com.example.androiddevchallenge.ui.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.ui.screens.HomeScreen
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.ui.screens.DetailScreen

@ExperimentalAnimationApi
@Composable
fun ComposeNavigation(
    navController: NavHostController,
    viewModel:MainViewModel = viewModel()
){
    NavHost(
        navController,
        startDestination = "home",
    ) {
        //HomeScreen - Starting Point
        composable("home") {
            HomeScreen(viewModel.doggoList){
                navController.navigate("details/$it")
            }
        }

        //Details Screen
        //Argument `index` = index of Doggo List
        composable (
            "details/{index}",
            arguments = listOf(navArgument("index") { type = NavType.IntType })
        ) {
            DetailScreen(
                it.arguments?.getInt("index") ?: -1
            ) {
                navController.navigate("home") {
                    launchSingleTop = true
                    popUpTo(route = "home") {}
                }
            }
        }
    }
}