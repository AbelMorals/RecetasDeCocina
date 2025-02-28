package com.example.recetasdecocina.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.components.TitleView
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
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacers()
        Receta(
            imageRes = R.drawable.albondigas_en_salsa,
            text = "Albóndigas en salsa"
        )
        Receta(
            imageRes = R.drawable.presentacion_principal_de_los_burritos_mexicanos_con_carne_picada,
            text = "Burritos de carne molida"
        )
        Receta(
            imageRes = R.drawable.chilidogs,
            text = "Hot Dog con Chili"
        )
        Receta(
            imageRes = R.drawable.hq720,
            text = "Hamburguesa rellena de queso y tocino"
        )
    }
}

@Composable
fun Receta(imageRes: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        MostrarImagen(imageRes, text)

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacers()
            TitleView(text)
            MainButton("Ir a receta", Color.Red, Color.White) {
                Log.d("Receta", "Ir a $text")
            }
        }
    }
}

@Composable
fun MostrarImagen(
    imagenRes: Int,
    descripcion: String,
    modifier: Modifier = Modifier
        .padding(top = 16.dp)
        .size(128.dp)
        .clip(RoundedCornerShape(10))
        .border(5.dp, Color.Gray, RoundedCornerShape(10))
) {
    Image(
        painter = painterResource(id = imagenRes),
        contentDescription = descripcion,
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}
