package com.example.data.di

import com.example.data.repositories.LoginRepositoryImpl
import com.example.domain.repositories.LoginRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindAccountRepository(
        loginRepositoryImpl: LoginRepositoryImpl
    ): LoginRepository
}
