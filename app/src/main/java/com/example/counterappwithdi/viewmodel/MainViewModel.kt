package com.example.counterappwithdi.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {
    var count = 0
    fun updateCount() {
        ++count
    }
}


