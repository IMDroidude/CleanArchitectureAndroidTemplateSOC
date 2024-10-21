package com.example.network.retrofit.di

import okhttp3.Interceptor

interface NetworkConfigurationProvider {
    /**
     * Base URL for the network object
     */
    fun getBaseUrl(): String

    /**
     * Add any custom interceptors here to be added with the network service
     */
    fun getInterceptors(): List<Interceptor>

    fun getLogLevel(): Int
}