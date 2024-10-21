package com.example.network.retrofit.di

import com.example.network.retrofit.ApiService
import com.example.network.retrofit.interceptors.FallbackConverterFactory
import com.example.network.retrofit.utils.JsonWithUnknowns
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideBaseUrl(configProvider: NetworkConfigurationProvider) : String =  configProvider.getBaseUrl()

    @Provides
    fun provideOkHttpClient(
        configProvider: NetworkConfigurationProvider,
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
        configProvider.getInterceptors().forEach {
            builder.addInterceptor(it)
        }
        builder.connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(2, TimeUnit.MINUTES)
            .writeTimeout(2, TimeUnit.MINUTES)

        return builder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(
                JsonWithUnknowns.asConverterFactory("application/json".toMediaType())
            )
            .addConverterFactory(FallbackConverterFactory())
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)
}

