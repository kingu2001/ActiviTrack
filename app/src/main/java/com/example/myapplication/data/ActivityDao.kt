package com.example.myapplication.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class ActivityDao {
    @Insert
    abstract suspend fun addActivity(activityEntity : ActivityItem)

    @Query("Select * From `activity-table`")
    abstract fun getAllActivities() : Flow<List<ActivityItem>>

    @Query("Select * From `activity-table` Where id=:id")
    abstract fun getActivityById(id:Int) : Flow<ActivityItem>

    @Update
    abstract suspend fun updateActivity(activityEntity: ActivityItem)

    @Delete
    abstract suspend fun deleteActivity(activityEntity: ActivityItem)
}