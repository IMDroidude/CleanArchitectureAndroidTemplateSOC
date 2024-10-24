package com.example.clearnarchitectureandroidtemplate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.auth.navigation.loginScreen
import com.example.clearnarchitectureandroidtemplate.states.AppState
import com.example.dashboard.navigation.dashboardGraph

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
        loginScreen(
            navController = navController,
            onLoginSuccess = {
                navController.navigate("dashboard_flow")
            }
        )
        dashboardGraph(
            navController = navController
        )
    }
}