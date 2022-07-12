package com.example.ex01.data.common.utils

import com.google.gson.annotations.SerializedName

data class ResponseListWrapper<T>(
    var code: Int,
    @SerializedName("status") var status: Boolean,
    @SerializedName("message") var message: String,
    @SerializedName("error") var error: List<String>,
    @SerializedName("data") var data: List<T>? = null,
)

data class ResponseWrapper<T>(
    var code: Int,
    @SerializedName("status") var status: Boolean,
    @SerializedName("message") var message: String,
    @SerializedName("error") var error: List<String>,
    @SerializedName("data") var data: T? = null,
)
