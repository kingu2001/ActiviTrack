package com.example.myapplication.data

data class ActivityItem(
    val id : Int = 0,
    var title : String = "",
    var description : String = ""
)

object DummyActivity{
    val activityList = listOf(
        ActivityItem(title = "Homework", description = "App development"),
        ActivityItem(title = "Cleaning", description = "Drawers")
    )
}