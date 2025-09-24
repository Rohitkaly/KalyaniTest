package com.example.holdings.data

import com.example.holdings.data.local.HoldingEntity
import kotlinx.coroutines.flow.Flow

interface HoldingsRepositoryContract {
    fun streamHoldings(): Flow<List<HoldingEntity>>
    suspend fun refreshFromNetwork(): RepoResult<Unit>
}
