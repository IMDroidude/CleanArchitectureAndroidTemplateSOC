package com.example.clearnarchitectureandroidtemplate.providers

interface BuildInfoProvider {
    fun getVersionName(): String
    fun getVersionCode(): String
    fun getBuildType(): String
}