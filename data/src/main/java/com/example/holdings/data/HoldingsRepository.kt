package com.example.holdings.data

import android.util.Log
import com.example.holdings.data.local.HoldingDao
import com.example.holdings.data.local.HoldingEntity
import com.example.holdings.data.model.HoldingDto
import com.example.holdings.data.remote.HoldingsApi
import kotlinx.coroutines.flow.Flow
import java.io.IOException

sealed class RepoResult<out T> {
    data class Success<T>(val data: T): RepoResult<T>()
    data class Error(val throwable: Throwable): RepoResult<Nothing>()
}

class HoldingsRepository(
    private val api: HoldingsApi,
    private val dao: HoldingDao
) : HoldingsRepositoryContract {
    override fun streamHoldings(): Flow<List<HoldingEntity>> = dao.getAll()

    override suspend fun refreshFromNetwork(): RepoResult<Unit> {
        return try {
            val response = this.api.getHoldings()
            val entities = response.data.holdings.map { dtoToEntity(it) }
            dao.clearAll()
            dao.insertAll(entities)
            RepoResult.Success(Unit)
        } catch (io: IOException) {
            RepoResult.Error(io)
        } catch (t: Throwable) {
            RepoResult.Error(t)
        }
    }

    private fun dtoToEntity(d: HoldingDto) = HoldingEntity(
        symbol = d.symbol,
        quantity = d.quantity,
        avgPrice = d.avgPrice,
        ltp = d.ltp,
        close = d.close
    )
}
