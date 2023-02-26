package com.example.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainScreenViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Main screen Fragment"
    }
    val text: LiveData<String> = _text
}