package com.example.holdings.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [HoldingEntity::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun holdingDao(): HoldingDao
}
