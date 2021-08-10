package com.example.compose_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize()
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp,Color.Red)
                    .padding(5.dp)
                    .border(30.dp,Color.Blue)
                    .padding(30.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "My",
                    modifier = Modifier
                        .offset(5.dp,20.dp)
                        .border(5.dp,Color.Green)
                        .padding(5.dp)
                        .border(5.dp,Color.Black)
                        .offset(10.dp,40.dp))
                Text(text = "Name")
                Text(text = "Ryosuke")
            }
        }
    }
}


