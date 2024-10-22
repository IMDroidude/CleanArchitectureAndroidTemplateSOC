package com.example.entity.requests

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestEntity(val mobile: String? = "", val password: String? = "")