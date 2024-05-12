package com.example.myapplication.View

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.ViewModel.ActivityViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AddEditDetailView(
    id: Int,
    viewModel: ActivityViewModel,
    navigation: Navigation
) {
    Scaffold(
        topBar = {
            TopBarView(
                title =
                if (id != 0) stringResource(id = R.string.update_activity)
                else stringResource(id = R.string.add_activity)
            )
        })
    {
        Column() {

        }
    }

}
