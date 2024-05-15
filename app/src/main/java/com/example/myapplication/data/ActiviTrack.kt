package com.example.myapplication.data

import android.app.Application

class ActiviTrack : Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}