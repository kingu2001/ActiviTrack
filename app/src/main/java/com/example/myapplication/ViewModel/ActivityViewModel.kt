package com.example.myapplication.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.ActivityRepository
import com.example.myapplication.data.Graph

class ActivityViewModel(
    val activityRepository: ActivityRepository = Graph.activityRepository
) : ViewModel() {
    var activityTitleState by mutableStateOf("")
    var activityDescriptionState by mutableStateOf("")

    fun onActivityTitleChanged(newString: String){
        activityTitleState = newString
    }

    fun onActivityDescriptionChanged(newString: String){
        
    }

}