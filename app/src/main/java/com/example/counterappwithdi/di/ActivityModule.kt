package com.example.counterappwithdi.di

import com.example.counterappwithdi.MainActivity
import dagger.Module

@Module
class ActivityModule {
    fun provideMainActivity(activity: MainActivity):MainActivity{return activity}
}