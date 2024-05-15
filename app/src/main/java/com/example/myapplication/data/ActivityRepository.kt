package com.example.myapplication.data

import kotlinx.coroutines.flow.Flow

class ActivityRepository(val activityDao: ActivityDao) {
    suspend fun addActivity(activityItem: ActivityItem) {
        activityDao.addActivity(activityItem)
    }

    fun getActivity(): Flow<List<ActivityItem>> = activityDao.getAllActivities()

    fun getActivityById(id: Int): Flow<ActivityItem> {
        return activityDao.getActivityById(id)
    }

    suspend fun updateActivity(activityItem: ActivityItem){
        activityDao.updateActivity(activityItem)
    }

    suspend fun deleteActivity(activityItem: ActivityItem){
        activityDao.deleteActivity(activityItem)
    }
}