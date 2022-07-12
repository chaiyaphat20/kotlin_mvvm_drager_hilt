package com.example.ex01.presentation.common.base

sealed class BaseResult<out T : Any, out : Any> {
    data class Success<T : Any>(val data: T) : BaseResult<T, Nothing>()
    data class Error<U : Any>(val rawResponse: U) : BaseResult<Nothing, U>()
}