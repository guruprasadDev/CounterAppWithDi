package com.example.counterappwithdi.di

import com.example.counterappwithdi.CounterApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, AppModule::class,ViewModelModule::class])
interface AppComponent : AndroidInjector<CounterApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: CounterApp): AppComponent
    }
}