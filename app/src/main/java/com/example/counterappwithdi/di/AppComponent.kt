package com.example.counterappwithdi.di

import com.example.counterappwithdi.MainActivity
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}