package com.example.holdings.data.model

import com.squareup.moshi.*

data class HoldingsResponse(
    @Json(name = "data") val data: DataWrapper
)

data class DataWrapper(
    @Json(name = "userHolding") val holdings: List<HoldingDto>
)

data class HoldingDto(
    @Json(name = "symbol") val symbol: String,
    @Json(name = "quantity") val quantity: Int,   // Use Int for quantities
    @Json(name = "ltp") val ltp: Double,
    @Json(name = "avgPrice") val avgPrice: Double,
    @Json(name = "close") val close: Double
)