package com.example.dto.account

import com.example.dto.base.NetworkModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponseDTO(
    ///@SerialName("ResponseCode")
    @SerialName("token")
    val responseCode: String,
//    @SerialName("ResponseDescription")
//    val responseDescription: String,
) : NetworkModel

