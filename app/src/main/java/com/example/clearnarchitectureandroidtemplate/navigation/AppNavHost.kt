package com.example.clearnarchitectureandroidtemplate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.clearnarchitectureandroidtemplate.states.AppState


///import androidx.compose.material.navigation.bottomSheet

import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import androidx.navigation.navOptions
import com.example.auth.navigation.loginScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    appState: AppState,
    startDestination: String = "Login"
) {
    val navController = appState.navController
    NavHost(
        navController = navController, startDestination = startDestination, modifier = modifier
    ) {
        loginScreen(navController = navController, onLoginSuccess = {
            //navController.navigateToDashboard()
            }
        )
    }
}