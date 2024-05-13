package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ActivityItem::class],
    version = 1,
    exportSchema = false
)

abstract class ActivityDatabase : RoomDatabase() {
    abstract fun activityDao() : ActivityDao
}