package com.example.data.datasources

import com.example.data.annotations.IoDispatcher
import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.dto.account.LoginRequestDTO
import com.example.dto.account.LoginResponseDTO
import com.example.network.retrofit.ApiService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class LoginDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : LoginDataSource {

    override fun login(request: LoginRequestDTO): Flow<Either<Failure, LoginResponseDTO>> {
        return flow {
            emit(safeApiCall { apiService.loginAuthentication(request) })
        }.flowOn(dispatcher) // Ensuring network call is on IO thread
    }
}
/*
class LoginDataSourceImpl @Inject constructor(
    private val apiService: ApiService,

) : LoginDataSource{
    override suspend fun login(request: LoginRequestDTO): Either<Failure, LoginResponseDTO> {
        return safeApiCall {
            apiService.loginAuthentication(request)
        }
    }
}*/
