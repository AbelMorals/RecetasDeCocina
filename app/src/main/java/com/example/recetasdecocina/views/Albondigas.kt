package com.example.recetasdecocina.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.SubTitleView
import com.example.ejemplo1.components.TitleView
import com.example.recetasdecocina.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Albondigas(navController: NavController){
    ContentView(navController)
}

@Composable
private fun ContentView(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            //.background(Color.Black)
            .padding(start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ImagenCuadrada(R.drawable.albondigas_en_salsa, "albondigas")
        Spacers()
        TitleView("Albondigas en salsa")
        Spacers()
        SubTitleView("Utensilios a usar:")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Spacers()
            ImagenChiquita(R.drawable.sarten,"sarten")
            MainButton("Regresar", Color.Red, Color.White) {
                navController.popBackStack()
            }
        }
    }
}

