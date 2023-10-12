package com.example.loginscreenjetpackcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginscreenjetpackcompose.ui.UserInputViewModel

@Composable
fun AppNavigation(
    userInputViewModel: UserInputViewModel = viewModel()
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {

        composable(route = Routes.USER_INPUT_SCREEN) {
            UserInputScreen(userInputViewModel)
        }

        composable(route = Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }

    }
}

// Navigation in compose
// Three components -> NavHost, NavGraph, NavController
// NavGraph -> Access to all screens in our project
// NavHost -> Empty Container where we will show all our screens we have inside our navGraph
// NavController -> we will navigate to different screens using this
// rememberNavController -> it helps to remember what was the last screen we are showing and also helps to navigate between screens