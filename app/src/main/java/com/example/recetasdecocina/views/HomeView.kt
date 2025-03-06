package com.example.recetasdecocina.views

import android.annotation.SuppressLint
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.components.TitleView
import com.example.recetasdecocina.R


@SuppressLint ("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn (ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){

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
        HideSystemUI()
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            // .background(Color.Black)
            .padding(top = 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacers()
        Receta(
            imageRes = R.drawable.albondigas_en_salsa,
            text = "Albóndigas en salsa",
            texto = "albondigas",
            navController
        )
        Receta(
            imageRes = R.drawable.presentacion_principal_de_los_burritos_mexicanos_con_carne_picada,
            text = "Burritos de carne molida",
            texto = "burritos",
            navController
        )
        Receta(
            imageRes = R.drawable.chilidogs,
            text = "Hot Dog con Chili",
            texto = "hotdog",
            navController
        )
        Receta(
            imageRes = R.drawable.hq720,
            text = "Hamburguesa rellena de queso y tocino",
            texto = "burger",
            navController
        )
        Receta(
            imageRes = R.drawable.stuffed_chileschiles_rellenos,
            text = "Chiles Rellenos",
            texto = "chilerelleno",
            navController
        )
    }
}

@Composable
fun Receta(imageRes: Int, text: String, texto: String, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        MostrarImagenRecortado(imageRes, text)

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacers()
            TitleView(text)
            MainButton("Ir a receta", Color.Red, Color.White) {
                navController.navigate(texto)
            }
        }
    }
}

@Composable
fun MostrarImagenRecortado(
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

@Composable
fun ImagenCuadrada(
    imagenRes: Int,
    descripcion: String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(270.dp)
) {
    Image(
        painter = painterResource(id = imagenRes),
        contentDescription = descripcion,
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}

@Composable
fun ImagenChiquita(
    imagenRes: Int,
    descripcion: String,
    modifier: Modifier = Modifier
        .size(70.dp)
) {
    Image(
        painter = painterResource(id = imagenRes),
        contentDescription = descripcion,
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}

@Composable
fun HideSystemUI() {
    val view = LocalView.current
    LaunchedEffect(Unit) {
        view.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )
    }
}