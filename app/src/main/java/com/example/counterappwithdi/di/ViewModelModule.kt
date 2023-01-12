package com.example.counterappwithdi.di

import com.example.counterappwithdi.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun providesViewModel():MainViewModel{
        return MainViewModel()
    }
}