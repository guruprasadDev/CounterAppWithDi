package com.example.counterappwithdi.di

import com.example.counterappwithdi.MainActivity
import com.example.counterappwithdi.viewmodel.MainViewModel
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [ViewModelModule::class, ActivityModule::class])
interface AppComponent {
    fun mainActivityInject(activity: MainActivity)
}