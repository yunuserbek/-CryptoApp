package com.example.cryptoapp.network

import com.example.cryptoapp.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiFactory {

    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getData(
        @Header("X-CMC_PRO_API_KEY")apikey:String,
        @Query("limit")limit:String
    ):CryptoResponse
}