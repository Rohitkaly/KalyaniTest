package com.example.holdings.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "holdings")
data class HoldingEntity(
    @PrimaryKey val symbol: String,
    val quantity: Int,
    val avgPrice: Double,
    val ltp: Double,
    val close: Double
)
