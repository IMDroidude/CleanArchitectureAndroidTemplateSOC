package com.example.dashboard.navigation.its

import com.example.common_feature.base.BaseViewModel

class DashboardViewModel : BaseViewModel() {


    sealed class DashboardScreenUiState {
        data object Loading : DashboardScreenUiState()
        data class Success(
            val test: String,
        ) : DashboardScreenUiState()

        data class Failed(val error: String) : DashboardScreenUiState()
    }
}