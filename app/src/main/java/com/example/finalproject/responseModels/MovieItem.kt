package com.example.finalproject.responseModels

import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("popularity")
    val popularity: Double? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("release_date")
    val releaseDate:String? = null,
    @SerializedName("vote_average")
    val voteAverage: Double? = null

)
