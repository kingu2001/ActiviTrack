package com.example.myapplication.data

import android.content.Context
import androidx.room.Room

object Graph {
    lateinit var database : ActivityDatabase

    val activityRepository by lazy{
        ActivityRepository(activityDao = database.activityDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, ActivityDatabase::class.java,"activityItem").build()
    }
}