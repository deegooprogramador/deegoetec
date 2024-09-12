package com.example.deego.views.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import com.example.deego.views.widget.WidgetTarefa
import androidx.compose.runtime.Composable
import com.example.deego.models.Tarefa as Tarefa1


@Composable
fun MainGui(){
    Box(){
        Text(Modifier = Modifier.background(Blue).align(Alignment.BottomEnd), text = "+")
    }

    Column {
        var tarefa1 = Tarefa("Aniversário do amigo", "15/09")
        WidgetTarefa(tarefa1)

        var tarefa2 = Tarefa("Consulta médica", "17/09")
        WidgetTarefa(tarefa2)

        var tarefa3 = Tarefa("Passeio em família", "23/09")
        WidgetTarefa(tarefa3)
    }
}

