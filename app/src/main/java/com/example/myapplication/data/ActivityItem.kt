package com.example.myapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "activity-table")
data class ActivityItem(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    @ColumnInfo(name = "activity-title")
    var title : String = "",
    @ColumnInfo(name = "activity-description")
    var description : String = ""
)

object DummyActivity{
    val activityList = listOf(
        ActivityItem(title = "Homework", description = "App development"),
        ActivityItem(title = "Cleaning", description = "Drawers")
    )
}