package com.example.domain.utils

sealed class Either<out L, out R> {
    data class Left<out L>(val failure: L) : Either<L, Nothing>()
    data class Right<out R>(val success: R) : Either<Nothing, R>()

    val isRight get() = this is Right<R>
    val isLeft get() = this is Left<L>

    companion object {
        fun <L> left(a: L) = Left(a)
        fun <R> right(b: R) = Right(b)
    }
}