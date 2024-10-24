package com.example.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navOptions
import com.example.auth.ui.login.LoginRoute


const val SPLASH_ROUTE = "splash"
const val LOGIN_ROUTE = "login"
const val BIO_METRIC_ROUTE = "biometric"
const val SIGN_UP_ROUTE = "signup"
const val SIGN_UP_MINOR_ROUTE = "signup_minor"
const val RESET_PIN_ROUTE = "reset_pin"
const val OTP_AUTHENTICATION_ROUTE = "otp_authentication"

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

//    composable(route = ZindigiScreens.ResetPin.route)
//    {
//        updateTopAppBar(
//            true,
//            stringLocal(id = R.string.reset_pin) // Default to insurance if title is null
//        )
//        ResetPinScreenRoute(onResetNowClicked = { navController.navigate(ZindigiScreens.DashboardFlow.route) })
//    }
}


fun NavController.navigateToLogin() {
    val navOptions = navOptions {
        popUpTo("Splash") { inclusive = true }
        launchSingleTop = true
    }
    navigate("Login", navOptions)
}


//fun NavController.navigateToDashboard() {
//    val navOptions = navOptions {
//        popUpTo(0) { inclusive = true }  // Clear the entire backstack
//        launchSingleTop = true           // Avoid multiple instances of the destination
//    }
//    navigate(ZindigiScreens.DashboardFlow.route, navOptions)
//}
