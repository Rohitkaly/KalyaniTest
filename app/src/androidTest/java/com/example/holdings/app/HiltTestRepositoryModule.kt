package com.example.holdings.app

import com.example.holdings.data.HoldingsRepositoryContract
import com.example.holdings.data.RepoResult
import com.example.holdings.data.local.HoldingEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton
import kotlinx.coroutines.flow.flow

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = *arrayOf(com.example.holdings.data.di.DataModule::class)
)
object HiltTestRepositoryModule {
    @Provides
    @Singleton
    fun provideFakeRepository(): HoldingsRepositoryContract = object : HoldingsRepositoryContract {
        override fun streamHoldings() = flow {
            emit(listOf(
                HoldingEntity("TST1", 2.0, 100.0, 110.0, 112.0),
                HoldingEntity("TST2", 1.0, 200.0, 195.0, 198.0)
            ))
        }
        override suspend fun refreshFromNetwork() = RepoResult.Success(Unit)
    }
}
