package com.example.dashboard.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

import androidx.navigation.compose.navigation
import com.example.dashboard.navigation.its.DashboardRoute

fun NavGraphBuilder.dashboardGraph(
    navController: NavController,
) {
    navigation(
        startDestination = "dashboard", route = "dashboard_flow"
    ) {
        composable(route = "dashboard") {
            DashboardRoute()
        }
    }
}