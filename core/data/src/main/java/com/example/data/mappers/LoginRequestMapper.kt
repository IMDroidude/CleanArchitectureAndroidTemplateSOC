package com.example.data.mappers

import com.example.data.base.DomainMapper
import com.example.dto.account.LoginRequestDTO
import com.example.entity.requests.LoginRequestEntity
import javax.inject.Inject

class LoginRequestMapper @Inject constructor(

): DomainMapper<LoginRequestEntity, LoginRequestDTO> {

    override fun mapToDomainModel(model: LoginRequestEntity): LoginRequestDTO {
        return LoginRequestDTO(
            mobileNo = model.mobile,
            password = model.password
        )
    }
}