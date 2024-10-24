package com.example.clearnarchitectureandroidtemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.clearnarchitectureandroidtemplate.states.rememberAppState
import com.example.clearnarchitectureandroidtemplate.ui.theme.ClearnArchitectureAndroidTemplateTheme
import com.example.clearnarchitectureandroidtemplate.ui.views.AppScaffold
import dagger.hilt.android.AndroidEntryPoint

///import androidx.compose.material.navigation.rememberBottomSheetNavigator

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val bottomSheetNavigator = rememberBottomSheetNavigator()
            val navController = rememberNavController()
            val appState = rememberAppState(
                navController = navController,
            )
            ClearnArchitectureAndroidTemplateTheme {
                AppScaffold(
                    modifier = Modifier.fillMaxSize(),
                    appState = appState
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    val navController = rememberNavController()
    val appState = rememberAppState(
        navController = navController,
    )
    ClearnArchitectureAndroidTemplateTheme {
        AppScaffold(appState = appState)
    }
}