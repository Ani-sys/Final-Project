package com.example.finalproject.responseModels

import com.google.gson.annotations.SerializedName

data class PopularsResponse(
    @SerializedName("page")
    val page:Int,
    @SerializedName("results")
    val results: List<MovieItem>
)
