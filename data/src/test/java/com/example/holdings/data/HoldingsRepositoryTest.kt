package com.example.holdings.data

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.holdings.data.local.AppDatabase
import com.example.holdings.data.local.HoldingDao
import com.example.holdings.data.model.DataWrapper
import com.example.holdings.data.model.HoldingDto
import com.example.holdings.data.model.HoldingsResponse
import com.example.holdings.data.remote.HoldingsApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FakeApi(private val resp: HoldingsResponse) : HoldingsApi {
    override suspend fun getHoldings(): HoldingsResponse = resp
}

class HoldingsRepositoryTest {

    private lateinit var db: AppDatabase
    private lateinit var dao: HoldingDao

    @Before
    fun setup() {
        val ctx = ApplicationProvider.getApplicationContext<android.content.Context>()
        db = Room.inMemoryDatabaseBuilder(ctx, AppDatabase::class.java).allowMainThreadQueries().build()
        dao = db.holdingDao()
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun refreshFromNetwork_insertsIntoDb() = runBlocking {
        val holdingDtoList = listOf(HoldingDto("X", 1, 50.0, 55.0, 54.0))
        val dataWrapperInstance = DataWrapper(holdings = holdingDtoList)
        val mockApiResponse = HoldingsResponse(data = dataWrapperInstance)
        val api = FakeApi(mockApiResponse)
        val repo = HoldingsRepository(api, dao)
        val res = repo.refreshFromNetwork()
        assert(res is RepoResult.Success)

        val entries = dao.getAll().first()
        assertEquals(1, entries.size)
        val e = entries[0]
        assertEquals("X", e.symbol)
        assertEquals(55.0, e.ltp, 0.001)
    }
}
