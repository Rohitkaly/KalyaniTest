package com.example.holdings.data.remote

import com.example.holdings.data.model.HoldingsResponse
import dagger.Module
import retrofit2.http.GET

interface HoldingsApi {
    @GET("/")
    suspend fun getHoldings(): HoldingsResponse
}
