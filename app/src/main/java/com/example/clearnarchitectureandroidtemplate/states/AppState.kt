package com.example.clearnarchitectureandroidtemplate.states

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberAppState(
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController,
): AppState {

    return remember(
        navController,
        coroutineScope
    ) {
        AppState(
            navController = navController,
            coroutineScope = coroutineScope,
        )
    }
}

@Stable
class AppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope
)