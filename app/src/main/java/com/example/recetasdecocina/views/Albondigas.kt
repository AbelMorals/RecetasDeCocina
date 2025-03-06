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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            //.background(Color.Black)}
            .verticalScroll(rememberScrollState())
    ) {
        ImagenCuadrada(R.drawable.albondigas_en_salsa, "albondigas")
        Spacers()
        TitleView("Albondigas en salsa")
        Spacers()
        SubTitleView("  Utensilios a usar:")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ImagenChiquita(R.drawable.sarten,"sarten")
            SubTitleView("Sartén")
            ImagenChiquita(R.drawable.licuadora,"licuadora")
            SubTitleView("Licuadora")
        }
        TitleView("Ingredientes")
        SubTitleView("  2 Tazas de Puré de tomate")
        SubTitleView("  1 Chile chipotle")
        SubTitleView("  3 Tazas de Agua")
        SubTitleView("  2 Cubos de Concentrado de Tomate con Pollo CONSOMATE®")
        SubTitleView("  1 Cucharada de Aceite de maíz")
        SubTitleView("  800 Gramos Carne de res molida")
        SubTitleView("  100 Gramos de Tocino picado y frito")
        SubTitleView("  1 Huevo")
        SubTitleView("  2 Cucharadas de Jugo MAGGI®")
        SubTitleView("  1 Cucharada de Salsa Tipo Inglesa CROSSE & BLACKWELL®")
        SubTitleView("  2 Cucharadas de Cebolla finamente picada")
        TitleView("¡A cocinar!")
        Text(text = "  Licúa", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  1.Para la salsa, licúa el puré de tomate, el chile, el agua y el Concentrado de Tomate con Pollo CONSOMATE®. Calienta el aceite en una olla y cocina la salsa a fuego medio por 10 minutos.")
        Text(text = "  Coce", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  2.Para las albóndigas, mezcla la carne con el tocino, la cebolla, el huevo, el Jugo MAGGI® y la Salsa Tipo Inglesa CROSSE & BLACKWELL®. Forma las albóndigas, colócalas en la salsa, tapa y cocina por 20 minutos a fuego medio o hasta que estén cocidas.")
        Text(text = "  Ofrece", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  3.Sirve las albóndigas en un plato y ofrece.")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MainButton("Regresar a recetas", Color.Red, Color.White) {
                navController.navigate("Home")
            }
            MainButton("Siguiente receta", Color.Red, Color.White) {
                navController.navigate("burritos")
            }
        }
    }
}

