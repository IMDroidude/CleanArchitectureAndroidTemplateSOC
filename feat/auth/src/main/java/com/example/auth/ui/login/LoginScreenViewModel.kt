package com.example.auth.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.LoginUseCase
import com.example.domain.utils.Either
import com.example.entity.requests.LoginRequestEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginScreenViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<LoginUiState>(LoginUiState.Idle)
    val uiState: StateFlow<LoginUiState> = _uiState

    fun login() = viewModelScope.launch {
        loginUseCase.execute(
            LoginRequestEntity()
        ).collect {
            when (it) {
                is Either.Left -> {

                }

                is Either.Right -> {

                }
            }
        }
    }
}


sealed interface LoginUiState {
    data object Idle : LoginUiState

    data object Loading : LoginUiState

//    data class Success(val loginModel: LoginResponseEntity) :
//        LoginUiState

    data class Failed(val error: String) : LoginUiState
}