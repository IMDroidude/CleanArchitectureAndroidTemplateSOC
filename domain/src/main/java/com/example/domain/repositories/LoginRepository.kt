package com.example.domain.repositories

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.entity.requests.LoginRequestEntity
import com.example.entity.responses.LoginResponseEntity

interface LoginRepository {
    suspend fun login(params: LoginRequestEntity): Either<Failure, LoginResponseEntity>
}