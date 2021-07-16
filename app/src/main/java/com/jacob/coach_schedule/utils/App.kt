package com.jacob.coach_schedule.utils

import android.app.Application
import android.os.StrictMode
import com.jacob.coach_schedule.BuildConfig
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App : Application(){

    fun App() {
        if (BuildConfig.DEBUG) StrictMode.enableDefaults()
    }
}