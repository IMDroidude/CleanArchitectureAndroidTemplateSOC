package com.example.dto.account

import com.example.dto.base.NetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestDTO(
    @SerialName("MobileNo") var mobileNo: String = "",
    @SerialName("Password") var password: String? = "",
) : NetworkModel
