package com.example.data.datasources

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import com.example.dto.account.LoginRequestDTO
import com.example.dto.account.toDomain
import com.example.entity.responses.LoginResponseEntity
import com.example.network.retrofit.ApiService
import javax.inject.Inject

class LoginDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
) : LoginDataSource{

    override suspend fun login(request: LoginRequestDTO): Either<Failure, LoginResponseEntity> {
        return try {
            // Make the API call
            val response = apiService.loginAuthentication(request)

            if (response.isSuccessful) {
                // Get the response body
                val body = response.body()

                // Check if the body is not null
                if (body != null) {
                    Either.Right(body.toDomain()) // Convert DTO to domain model
                } else {
                    Either.Left(Failure("Error: Empty response body"))
                }
            } else {
                // Handle API error
                Either.Left(Failure("Error: ${response.code()} - ${response.message()}"))
            }
        } catch (e: Exception) {
            // Handle exceptions (e.g., network errors)
            Either.Left(Failure(e.message ?: "Unknown error"))
        }
    }
}