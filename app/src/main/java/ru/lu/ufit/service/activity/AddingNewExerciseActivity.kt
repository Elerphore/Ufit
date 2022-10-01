package ru.lu.ufit.service.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import ru.lu.ufit.ui.components.exercise.AddNewExerciseMainScreen
import ru.lu.ufit.ui.theme.UFitTheme

class AddingNewExerciseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UFitTheme { Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) { AddNewExerciseMainScreen().Main() } }
        }
    }
}