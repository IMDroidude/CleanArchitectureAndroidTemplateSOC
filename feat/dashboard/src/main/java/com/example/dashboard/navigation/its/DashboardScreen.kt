package com.example.dashboard.navigation.its

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun DashboardRoute(
    modifier: Modifier = Modifier,
    viewModel: DashboardViewModel = hiltViewModel(),
    onRouteSelected: (String) -> Unit = {}
) {
    DashboardScreen(
        modifier = modifier,
        onRouteSelected = onRouteSelected
    )
}

@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier,
    onRouteSelected: (String) -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {

            },
            shape = MaterialTheme.shapes.small
        ) {
            Text("Dashbaord Clicked")
        }
    }
}