package com.example.dto.account

import com.example.dto.base.NetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestDTO(
    @SerialName("email") var mobileNo: String? = "",
    @SerialName("password") var password: String? = "",
) : NetworkModel
