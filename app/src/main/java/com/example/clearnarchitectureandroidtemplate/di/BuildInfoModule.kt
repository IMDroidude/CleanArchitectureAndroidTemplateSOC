package com.example.clearnarchitectureandroidtemplate.di

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import com.example.clearnarchitectureandroidtemplate.providers.BuildInfoProvider
import javax.inject.Inject

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BuildInfoModule {

    @Binds
    abstract fun bindBuildInfoProvider(
        impl: BuildInfoProviderImpl
    ): BuildInfoProvider
}


class BuildInfoProviderImpl @Inject constructor(
    private val context: Context
) : BuildInfoProvider {

    override fun getVersionName(): String {
        return try {
            val packageInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
            packageInfo.versionName ?: "Unknown"
        } catch (e: PackageManager.NameNotFoundException) {
            "Unknown"
        }
    }

    override fun getVersionCode(): String {
        return try {
            val packageInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
            packageInfo.versionCode.toString()
        } catch (e: PackageManager.NameNotFoundException) {
            "Unknown"
        }
    }

    override fun getBuildType(): String {
        return "debug"
        //return if (BuildConfig.DEBUG) "debug" else "release"
    }
}