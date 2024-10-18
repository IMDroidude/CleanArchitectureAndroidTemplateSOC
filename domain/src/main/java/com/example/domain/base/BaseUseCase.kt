package com.example.domain.base

import com.example.domain.exceptions.Failure
import com.example.domain.utils.Either

abstract class BaseUseCase<ResultType, in ParamsType> {
    abstract suspend fun execute(params: ParamsType): Either<Failure, ResultType>

    // Operator function to simplify calling the use case
    suspend operator fun invoke(params: ParamsType): Either<Failure, ResultType> {
        return execute(params)
    }
}

// A class representing no parameters
object NoParams