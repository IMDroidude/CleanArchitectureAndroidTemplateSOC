package com.example.domain.repositories

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.entity.requests.LoginParamsEntity
import com.example.entity.responses.LoginResponseEntity

interface LoginRepository {
    suspend fun login(params: LoginParamsEntity): Either<Failure, LoginResponseEntity>
}