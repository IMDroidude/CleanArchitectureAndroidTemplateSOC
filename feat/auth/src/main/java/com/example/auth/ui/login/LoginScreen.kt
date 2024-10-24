package com.example.auth.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun LoginRoute(
    modifier: Modifier = Modifier,
    viewModel: LoginScreenViewModel = hiltViewModel(),
    onLoginSuccess: () -> Unit,
) {
    val loginUiState by viewModel.uiState.collectAsStateWithLifecycle()
    LoginScreen(
        loginUiState = loginUiState,
        onLoginSuccess = onLoginSuccess
    )
}

@Composable
internal fun LoginScreen(
    modifier: Modifier = Modifier,
    loginUiState: LoginUiState,
    onLoginSuccess: (() -> Unit)? = null
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {
                onLoginSuccess?.invoke()
            },
            shape = MaterialTheme.shapes.small
        ) {
            Text("Login Clicked")
        }
    }
}