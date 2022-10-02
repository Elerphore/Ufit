package ru.lu.ufit.service.viewmodel.exercise

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.lu.ufit.database.exercise.ExerciseRepositoryImpl
import javax.inject.Inject

@HiltViewModel
class AddingNewExerciseViewModel @Inject constructor(
    private val exerciseRepository: ExerciseRepositoryImpl
) : ViewModel() {
    init {
        println("view model")
    }
    fun main() {
        println("testing")
    }
}