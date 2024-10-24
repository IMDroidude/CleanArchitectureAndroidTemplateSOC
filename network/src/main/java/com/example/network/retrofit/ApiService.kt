package com.example.network.retrofit

import com.example.dto.account.LoginRequestDTO
import com.example.dto.account.LoginResponseDTO
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

// FIXME: create ApiService for each feature separately... 
interface ApiService {

    ///@POST("Account/LoginAuthentication")
    @POST("api/login")
    suspend fun loginAuthentication(@Body request: LoginRequestDTO): Response<LoginResponseDTO>
}