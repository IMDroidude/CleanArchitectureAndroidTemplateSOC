package com.example.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.auth.ui.login.LoginRoute

const val LOGIN_ROUTE = "login"

fun NavGraphBuilder.loginScreen(
    navController: NavController,
    onLoginSuccess: () -> Unit
) {
    composable(route = "Login")
    {
        LoginRoute(
            onLoginSuccess = onLoginSuccess,
        )
    }
}

