package com.example.entity.requests

import kotlinx.serialization.Serializable

@Serializable
data class LoginParamsEntity(val mobile: String? = "", val password: String? = "")