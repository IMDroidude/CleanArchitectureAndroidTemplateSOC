package com.example.data.datasources

import com.example.data.base.BaseDataSource
import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.dto.account.LoginRequestDTO
import com.example.dto.account.LoginResponseDTO
import com.example.entity.responses.LoginResponseEntity
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface LoginDataSource : BaseDataSource {
    fun login(request: LoginRequestDTO): Flow<Either<Failure, LoginResponseDTO>>
}

/*
interface LoginDataSource : BaseDataSource{
    suspend fun login(request: LoginRequestDTO)  : Either<Failure, LoginResponseDTO>
}*/
