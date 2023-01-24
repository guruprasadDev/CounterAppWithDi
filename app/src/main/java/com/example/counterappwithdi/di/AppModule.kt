package com.example.counterappwithdi.di

import android.content.Context
import com.example.counterappwithdi.CounterApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: CounterApp): Context {
        return app
    }
}
