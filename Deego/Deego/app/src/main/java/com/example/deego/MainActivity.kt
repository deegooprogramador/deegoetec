package com.example.deego

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.deego.ui.theme.DeegoTheme
import com.example.deego.views.MainGui

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainGui();
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeegoTheme {
        MainGui();
    }
}