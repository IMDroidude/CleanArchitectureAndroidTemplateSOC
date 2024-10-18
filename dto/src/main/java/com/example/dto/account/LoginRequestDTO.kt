package com.example.dto.account

import com.example.dto.base.NetworkModel
import com.example.entity.responses.LoginResponseEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestDTO(
    @SerialName("EnableFingerPrint") var enableFingerPrint: Boolean = false,
    @SerialName("FirebaseToken") var firebaseToken: String = "",
    @SerialName("MPin") var mPin: String = "",
    @SerialName("MobileNo") var mobileNo: String = "",
    @SerialName("OS") var os: String? = "Android",
    @SerialName("ApplicationVersion") var applicationVersion: String? = "",
    @SerialName("UDID") var udid: String? = "",
) : NetworkModel

fun LoginResponseDTO.toDomain(): LoginResponseEntity {
    return LoginResponseEntity(
        id = "",
        name = "Wao"
    )
}