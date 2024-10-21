package com.example.data.base

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either
import retrofit2.Response

interface BaseDataSource {

    suspend fun <T> safeApiCall(apiCall: suspend () -> Response<T>): Either<Failure, T> {
        return try {
            // Execute the API call
            val response = apiCall()

            // Check if the response was successful
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    Either.Right(body) // Success with non-null body
                } else {
                    Either.Left(Failure("Error: Empty response body")) // Handle empty body
                }
            } else {
                // Handle unsuccessful response
                Either.Left(Failure("Error: ${response.code()} - ${response.message()}"))
            }
        } catch (e: Exception) {
            // Catch and handle exceptions such as network errors
            Either.Left(Failure(e.message ?: "Unknown error"))
        }
    }
}