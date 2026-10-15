package com.example.statehoisting.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var nim by mutableStateOf("245150407111037")
        private set

    var nama by mutableStateOf("Muhammad Murfid Kharomen")
        private set

    var counter by mutableIntStateOf(0)
        private set

    fun onUpClick() {
        counter++
    }

    fun onDownClick() {
        counter--
    }

    fun onResetClick() {
        counter = 0
    }
}
