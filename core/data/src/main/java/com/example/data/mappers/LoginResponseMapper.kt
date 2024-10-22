package com.example.data.mappers

import com.example.data.base.DomainMapper
import com.example.dto.account.LoginResponseDTO
import com.example.entity.responses.LoginResponseEntity
import javax.inject.Inject

class LoginResponseMapper @Inject constructor(

): DomainMapper<LoginResponseDTO,LoginResponseEntity> {
    override fun mapToDomainModel(model: LoginResponseDTO): LoginResponseEntity {
        return LoginResponseEntity(responseCode = model.responseCode
        ///    , responseDescription = model.responseDescription
        )
    }
}