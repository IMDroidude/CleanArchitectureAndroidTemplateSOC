package com.example.clearnarchitectureandroidtemplate.ui.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.clearnarchitectureandroidtemplate.navigation.AppNavHost
import com.example.clearnarchitectureandroidtemplate.states.AppState

@Composable
fun AppScaffold(
    modifier: Modifier = Modifier,
    appState: AppState
) {
    Scaffold(
        modifier = modifier.fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars),
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onBackground,
    ) { padding ->
        val startDestination = remember { "login" }
        Box(modifier = Modifier.padding(padding)) {
            AppNavHost(
                appState = appState,
                startDestination = startDestination,
            )
        }
    }
}


//    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState()
//    BottomSheetScaffold(
//        sheetContent = {
//            /* Add code later */
//        },
//        scaffoldState = bottomSheetScaffoldState,
//    ) {
//        /* Add code later */
//    }


