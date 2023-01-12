package com.example.counterappwithdi

import android.app.Application
import com.example.counterappwithdi.di.AppComponent
import com.example.counterappwithdi.di.DaggerAppComponent

class App : Application() {
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().build()
    }
}