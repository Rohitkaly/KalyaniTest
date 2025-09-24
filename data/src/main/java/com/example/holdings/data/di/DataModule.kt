package com.example.holdings.data.di

import android.content.Context
import androidx.room.Room
import com.example.holdings.data.HoldingsRepository
import com.example.holdings.data.HoldingsRepositoryContract
import com.example.holdings.data.local.AppDatabase
import com.example.holdings.data.local.HoldingDao
import com.example.holdings.data.remote.HoldingsApi
import com.example.holdings.domain.Consts
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BASIC
        return OkHttpClient.Builder().addInterceptor(logging).build()
    }

    @Provides
    @Singleton
    fun provideHoldingsApi(moshi: Moshi, ok: OkHttpClient): HoldingsApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(Consts.BASE_URL)
            .client(ok)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
        return retrofit.create(HoldingsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDb(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "holdings-db").fallbackToDestructiveMigration().build()

    @Provides
    fun provideDao(db: AppDatabase): HoldingDao = db.holdingDao()

    @Provides
    @Singleton
    fun provideRepository(api: HoldingsApi, dao: HoldingDao): HoldingsRepositoryContract =
        HoldingsRepository(api, dao)
}
