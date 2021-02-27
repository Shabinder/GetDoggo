package com.example.androiddevchallenge

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.models.Doggo
import com.example.androiddevchallenge.models.getDoggoList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    val doggoList = mutableStateListOf<Doggo>()

}