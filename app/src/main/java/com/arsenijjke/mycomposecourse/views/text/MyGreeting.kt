package com.arsenijjke.mycomposecourse.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/** Funny Bordes Thing */
@Composable
fun Greeting(name: String) {

    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .padding(top = 5.dp)
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)
            .fillMaxSize()
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .border(5.dp, Color.Yellow),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(5.dp)
                .border(1.dp, Color.Blue)
        )
        Text(text = "Hello")
        Row {
            Text(text = "Kekw")
        }
    }
}