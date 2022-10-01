package ru.lu.ufit.ui.components

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import ru.lu.ufit.R
import ru.lu.ufit.service.activity.AddingNewExerciseActivity

class MainScreen : Fragment() {
    @OptIn(ExperimentalUnitApi::class)
    @Composable
    fun Main() {
        val context = LocalContext.current

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.add),
                contentScale = ContentScale.Inside,
                contentDescription = "add button",
                modifier = Modifier.clickable { context.startActivity(Intent(context, AddingNewExerciseActivity::class.java)) }
            )
            Text(text = "New exercise", color = Color.Gray, fontSize = TextUnit(10f, TextUnitType.Sp), modifier = Modifier.padding(top = 10.dp))
        }
    }
}