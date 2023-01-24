package com.example.counterappwithdi.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.counterappwithdi.viewmodel.MainViewModel
import com.example.counterappwithdi.viewmodel.ViewModelFactory
import com.example.counterappwithdi.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun getViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
    // Using this Module we will pass daggers map which has all the viewModels to the viewModel Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun getMainViewModel(mainViewModel: MainViewModel): ViewModel
    //Here we are putting MainViewModel using the key we defined earlier into DaggersMap by annotation @IntoMap
}