package com.example.recetasdecocina.views

import android.annotation.SuppressLint
import android.app.ActivityManager.RecentTaskInfo
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.ejemplo1.components.ActionButton
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.TitleView
import com.example.ejemplo1.components.TitleBar
import com.example.recetasdecocina.R


@SuppressLint ("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn (ExperimentalMaterial3Api::class)
@Composable
fun HomeView(){

    Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                title={TitleBar("Recetas de cocina")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        }
    ){
        ContentView()
    }
}

@Composable
private fun ContentView()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        SimpleImage()
        TitleView("Albóndigas")
        Spacers()
        MainButton("Ir a receta",Color.Red,Color.White) {
            Log.d("","soy dalto")
        }
        SimpleImage1()
        TitleView("Burritos de carne molida")
        Spacers()
        MainButton("Ir a receta",Color.Red,Color.White) {
            Log.d("","soy dalto")
        }
        SimpleImage2()
        TitleView("Hot Dog con Chili")
        Spacers()
        MainButton("Ir a receta",Color.Red,Color.White) {
            Log.d("","soy dalto")
        }
        SimpleImage3()
        TitleView("Hamburguesa rellena de queso y tocino")
        Spacers()
        MainButton("Ir a receta",Color.Red,Color.White) {
            Log.d("","soy dalto")
        }
    }
}

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.albondigas_en_salsa),
        contentDescription = "Albondigas",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleImage1() {
    Image(
        painter = painterResource(id = R.drawable.presentacion_principal_de_los_burritos_mexicanos_con_carne_picada),
        contentDescription = "burritos",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleImage2() {
    Image(
        painter = painterResource(id = R.drawable.chilidogs),
        contentDescription = "chilidogs",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleImage3() {
    Image(
        painter = painterResource(id = R.drawable.hq720),
        contentDescription = "burger",
        modifier = Modifier.fillMaxWidth()
    )
}