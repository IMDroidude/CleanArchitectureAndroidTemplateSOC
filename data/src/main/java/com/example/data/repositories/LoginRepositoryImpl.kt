package com.example.data.repositories

import com.example.data.datasources.LoginDataSource
import com.example.domain.exceptions.Failure
import com.example.domain.repositories.LoginRepository
import com.example.domain.utils.Either
import com.example.dto.account.LoginRequestDTO
import com.example.entity.requests.LoginParamsEntity
import com.example.entity.responses.LoginResponseEntity
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private var loginDataSource: LoginDataSource
    // network check should be here in order to send data from localDataSource
    // mapper class should be passed here so it can convert ResponseDTO's to ResponseEntities
) : LoginRepository {

    override suspend fun login(params: LoginParamsEntity): Either<Failure, LoginResponseEntity> {
        val requestDTO = LoginRequestDTO();
        return loginDataSource.login(requestDTO);
    }
}