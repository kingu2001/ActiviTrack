package com.example.myapplication.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.ActivityItem
import com.example.myapplication.data.ActivityRepository
import com.example.myapplication.data.Graph
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ActivityViewModel(
    val activityRepository: ActivityRepository = Graph.activityRepository
) : ViewModel() {
    var activityTitleState by mutableStateOf("")
    var activityDescriptionState by mutableStateOf("")

    fun onActivityTitleChanged(newString: String){
        activityTitleState = newString
    }

    fun onActivityDescriptionChanged(newString: String){
        activityDescriptionState = newString
    }

    lateinit var getAllActivies : Flow<List<ActivityItem>>
    init{
        viewModelScope.launch {
            getAllActivies = activityRepository.getActivity()
        }
    }

    fun addActivity(activityItem: ActivityItem){
        viewModelScope.launch(Dispatchers.IO) {
            activityRepository.addActivity(activityItem = activityItem)
        }
    }

    fun getActivityById(id : Int) : Flow<ActivityItem>{
        return activityRepository.getActivityById(id)
    }

    fun updateActivity(activityItem: ActivityItem){
        viewModelScope.launch{
            activityRepository.updateActivity(activityItem = activityItem)
        }
    }

    fun deleteActivity(activityItem: ActivityItem){
        viewModelScope.launch(Dispatchers.IO){
            activityRepository.deleteActivity(activityItem = activityItem)
        }
    }

}