package com.example.counterappwithdi.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {
    var count = 0

    fun updateCount() {
        ++count
    }
}


