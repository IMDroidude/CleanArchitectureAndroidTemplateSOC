package com.example.data.mappers

import com.example.data.base.DomainMapper
import com.example.dto.account.LoginRequestDTO
import com.example.entity.requests.LoginParamsEntity
import javax.inject.Inject

class LoginRequestMapper @Inject constructor(

): DomainMapper<LoginParamsEntity, LoginRequestDTO> {

    override fun mapToDomainModel(model: LoginParamsEntity): LoginRequestDTO {
        return LoginRequestDTO(
            mobileNo = model.mobile,
            password = model.password
        )
    }
}