package com.example.android3lesson7dz.models.pok

import com.google.gson.annotations.SerializedName

data class ResponseModel<T>(
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<T>?
)