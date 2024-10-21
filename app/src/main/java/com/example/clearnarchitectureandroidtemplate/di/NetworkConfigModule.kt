package com.example.clearnarchitectureandroidtemplate.di

import com.example.network.retrofit.di.NetworkConfigurationProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkConfigModule {
    @Binds
    abstract fun bindNetworkConfigurationProvider(impl: NetworkConfigurationProviderImpl): NetworkConfigurationProvider
}

class NetworkConfigurationProviderImpl @Inject constructor(

) : NetworkConfigurationProvider {
    override fun getBaseUrl(): String  = "https://reqres.in/"

    override fun getInterceptors(): List<Interceptor> = listOf()

    override fun getLogLevel(): Int = 0

}