package com.example.android3lesson7dz.models.pok

import com.google.gson.annotations.SerializedName

data class ResultsItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)