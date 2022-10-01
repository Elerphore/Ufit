package ru.lu.ufit.service.viewmodel.exercise

import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddingNewExerciseViewModel @Inject constructor() : ViewModel() {
    init {
        println("view model")
    }
    fun main() {
        println("testing")
    }
}