package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx. compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx. compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx. compose.material3. TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var ydl by rememberSaveable {
                mutableStateOf("Diego e Yasmim")
            }
            TextField(value = ydl, onValueChange = {ydl = it   })
        }
    }
}