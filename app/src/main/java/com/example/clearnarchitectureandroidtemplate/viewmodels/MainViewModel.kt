package com.example.clearnarchitectureandroidtemplate.viewmodels

import androidx.lifecycle.viewModelScope
import com.example.clearnarchitectureandroidtemplate.base.BaseViewModel
import com.example.domain.usecases.LoginUseCase
import com.example.domain.utils.Either
import com.example.entity.requests.LoginRequestEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
) : BaseViewModel(){

    fun login() = viewModelScope.launch (Dispatchers.IO) {
        val mResp = loginUseCase.invoke(LoginRequestEntity(
            mobile = "eve.holt@reqres.in",
            password = "cityslicka"
        ))
        when(mResp){
            is Either.Left -> {
                System.out.println("mResp Failed")
                System.out.println(mResp.failure.message)
            }
            is Either.Right -> {
                mResp.success.responseCode
                System.out.println("mResp Success")
                System.out.println(mResp.success.responseCode)
            }
        }
    }
}