package ru.lu.ufit.ui.components.exercise

import android.graphics.Bitmap
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import ru.lu.ufit.service.viewmodel.exercise.AddingNewExerciseViewModel

@AndroidEntryPoint
class AddNewExerciseMainScreen : Fragment() {
    @Composable
    fun Main(
        scaffoldState: ScaffoldState = rememberScaffoldState(),
    ) {
        val viewModel: AddingNewExerciseViewModel = hiltViewModel()

        LaunchedEffect(scaffoldState.snackbarHostState) {
        }
        
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RenderForm()
        }
    }


    @Composable
    private fun RenderForm() {
        Text(text = "Create new exercise")
        InputFields()
        ImageField()
        
        Button(modifier = Modifier.width(280.dp), onClick = { }) {
            Text(text = "Add Exercise")
        }
    }

    @Composable
    private fun InputFields() {
        var name by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }
        var timer by remember { mutableStateOf(0) }

        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text(text = "Name") }, singleLine = true)
        OutlinedTextField(value = description, onValueChange = { description = it }, label = { Text(text = "Description") }, maxLines = 3)
        OutlinedTextField(
            value = timer.toString(),
            onValueChange = { if(it.length < 4 && it.toIntOrNull() != null) timer = it.toInt() },
            label = { Text(text = "Time (sec)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }

    @Composable
    private fun ImageField() {
        var imageUri by remember { mutableStateOf<Uri?>(null) }
        val context = LocalContext.current
        val bitmap =  remember { mutableStateOf<Bitmap?>(null) }
        val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { uri: Uri? -> imageUri = uri }

        Column {
            Button(
                modifier = Modifier.width(280.dp),
                onClick = {
                launcher.launch("image/*")
            }) {
                when(imageUri) {
                    null -> Text(text = "Pick image")
                    else -> Text(text = imageUri!!.lastPathSegment!!)
                }
            }
//            imageUri?.let {
//                val source = ImageDecoder.createSource(context.contentResolver,it)
//                bitmap.value = ImageDecoder.decodeBitmap(source)
//                bitmap.value?.let {  btm ->
//                    Image(bitmap = btm.asImageBitmap(), contentDescription = null, modifier = Modifier.size(280.dp))
//                }
//            }

        }

    }

}