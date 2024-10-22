package com.example.data.repositories

import com.example.data.datasources.LoginDataSource
import com.example.data.mappers.LoginRequestMapper
import com.example.data.mappers.LoginResponseMapper
import com.example.domain.exceptions.Failure
import com.example.domain.repositories.LoginRepository
import com.example.domain.utils.Either
import com.example.entity.requests.LoginRequestEntity
import com.example.entity.responses.LoginResponseEntity
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private var loginDataSource: LoginDataSource,
    private val loginRequestMapper: LoginRequestMapper,
    private val loginResponseMapper: LoginResponseMapper
    // network check should be here in order to send data from localDataSource
) : LoginRepository {

    override suspend fun login(params: LoginRequestEntity): Either<Failure, LoginResponseEntity> {
        val loginRequestDTO = loginRequestMapper.mapToDomainModel(params);
        val result = loginDataSource.login(loginRequestDTO)
        // Map data DTO to domain entity and return
        return result.map { loginResponseMapper.mapToDomainModel(it) }
    }
}