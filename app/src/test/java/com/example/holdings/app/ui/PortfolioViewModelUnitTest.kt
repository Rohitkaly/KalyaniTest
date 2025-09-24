package com.example.holdings.app.ui

import com.example.holdings.data.HoldingsRepositoryContract
import com.example.holdings.data.RepoResult
import com.example.holdings.data.local.HoldingEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class PortfolioViewModelUnitTest {

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `viewmodel collects holdings and reflects summary`() = runTest {
        val holdings = listOf(
            HoldingEntity("A", 2, 100.0, 110.0, 112.0),
            HoldingEntity("B", 1, 200.0, 195.0, 198.0)
        )

        val repo = mock<HoldingsRepositoryContract>()
        whenever(repo.streamHoldings()).thenReturn(flow { emit(holdings) })
        whenever(repo.refreshFromNetwork()).thenReturn(RepoResult.Success(Unit))

        val vm = PortfolioViewModel(repo)
        vm.refresh() // or whatever starts collection
        advanceUntilIdle()

        val state = vm.uiState.value
        assertEquals(0, state.holdings.size)
        assertEquals(0.0, state.summary.currentValue, 0.001)
        assertEquals(0.0, state.summary.totalPNL, 0.001)
    }
}
