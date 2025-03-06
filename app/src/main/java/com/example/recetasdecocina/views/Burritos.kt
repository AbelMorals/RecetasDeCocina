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
fun Burritos(navController: NavController){
    ContentView(navController)
}

@Composable
private fun ContentView(navController: NavController){
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ImagenCuadrada(R.drawable.presentacion_principal_de_los_burritos_mexicanos_con_carne_picada, "burritos")
        Spacers()
        TitleView("Burritos de carne molida")
        Spacers()
        SubTitleView("  Utensilios a usar")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ImagenChiquita(R.drawable.sarten,"sarten")
            SubTitleView("Sartén")
            ImagenChiquita(R.drawable.cuchara,"cuchara")
            SubTitleView("Cuchara")
        }
        TitleView("Ingredientes")
        SubTitleView("  2 Cucharadas de Aceite vegetal")
        SubTitleView("  1/2 Cebolla picada finamente ")
        SubTitleView("  1 Cucharada de Ajo picado finamente")
        SubTitleView("  500 Gramos de Carne de res molida")
        SubTitleView("  2 Cucharadas de Jugo MAGGI®")
        SubTitleView("  2 Cucharadas de Salsa Tipo Inglesa CROSSE & BLACKWELL®")
        SubTitleView("  2 Piezas de Chile serrano cortados en rodajas")
        SubTitleView("  1 Cucharadita de Sal con ajo en polvo")
        SubTitleView("  5 Ramitas de Perejil fresco desinfectado y picado finamente")
        SubTitleView("  6 Tortillas de harina para burritos, calientes")
        SubTitleView("  1 Taza de Frijoles bayos enteros calientes")
        SubTitleView("  1 Paquete de Queso cheddar rallado (226 g)")
        SubTitleView("  1/2 Cebolla picada finamente")
        SubTitleView("  2 Jitomates cortados en cubos")
        SubTitleView("  1 Chile serrano picado finamente")
        SubTitleView("  5 Ramitas de Cilantro fresco desinfectado y picado finamente")
        SubTitleView("  1 Aguacate cortado en cubos")
        SubTitleView("  1 Limón (su jugo)")
        SubTitleView("  1 Cucharadita de Sal con cebolla en polvo")
        TitleView("¡A cocinar!")
        Text(text = "  Cocina", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  1.En una sartén, calienta el aceite y fríe ½ cebolla hasta que cambie de color. Agrega el ajo, la carne, el Jugo MAGGI®, la Salsa Tipo Inglesa CROSSE & BLACKWELL®, 2 chiles, la sal con ajo y el perejil; cocina por 3 minutos.")
        Text(text = "  Rellena", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  2.Rellena las tortillas con la preparación de carne, añade frijoles y queso, doblas las orillas y enrolla. Ásalos en una sartén por ambos lados y corta a la mitad.")
        Text(text = "  Sirve", fontSize = 30.sp, color = Color.Black)
        SubTitleView("  3.Para el pico de gallo, mezcla ½ cebolla con los jitomates, 1 chile serrano, el cilantro, el aguacate, el jugo de limón, la sal con cebolla y acompaña con los burritos. Ofrece.")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            MainButton("Regresar a recetas", Color.Red, Color.White) {
                navController.navigate("Home")
            }
            MainButton("Siguiente receta", Color.Red, Color.White) {
                navController.navigate("hotdog")
            }
        }
    }
}