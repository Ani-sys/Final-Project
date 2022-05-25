package com.example.finalproject.API

import com.example.finalproject.responseModels.PopularsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("authentication/token/validate_with_login")
   suspend fun loginWithUserName
                (@Query("api_key")
        apiKey:String):PopularsResponse
}