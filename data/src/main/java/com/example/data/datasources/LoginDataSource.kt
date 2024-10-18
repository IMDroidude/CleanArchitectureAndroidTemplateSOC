package com.example.data.datasources

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.dto.account.LoginRequestDTO
import com.example.entity.responses.LoginResponseEntity

interface LoginDataSource {
    suspend fun login(request: LoginRequestDTO)  : Either<Failure, LoginResponseEntity>
}