package com.example.domain.usecases

import com.example.domain.base.BaseUseCase
import com.example.domain.exceptions.Failure
import com.example.domain.repositories.LoginRepository
import com.example.domain.utils.Either
import com.example.entity.requests.LoginRequestEntity
import com.example.entity.responses.LoginResponseEntity
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val loginRepository: LoginRepository) :
    BaseUseCase<LoginResponseEntity, LoginRequestEntity>() {

    override suspend fun execute(params: LoginRequestEntity): Either<Failure, LoginResponseEntity> {
        return loginRepository.login(params)
    }
}