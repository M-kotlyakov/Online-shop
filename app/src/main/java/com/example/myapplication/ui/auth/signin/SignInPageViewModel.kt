package com.example.myapplication.ui.auth.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInPageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Sign In screen Fragment"
    }
    val text: LiveData<String> = _text
}