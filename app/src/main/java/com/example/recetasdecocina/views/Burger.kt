package com.example.recetasdecocina.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.Navegacion
import com.example.ejemplo1.components.Spacers
import com.example.ejemplo1.components.SubTitleView
import com.example.ejemplo1.components.TitleView
import com.example.recetasdecocina.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Burger(navController: NavController){
    Image(
        painter = painterResource(id = R.drawable.madera),
        contentDescription = "madera",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
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
        ImagenCuadrada(R.drawable.burger, "Hamburguesa rellena de queso y tocino")
        TitleView("Hamburguesa rellena de queso y tocino")
        Spacers()
        SubTitleView("Utensilios a usar")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            ImagenChiquita(R.drawable.sarten,"sarten")
            SubTitleView("  Sartén")
        }
        TitleView("Ingredientes")
        SubTitleView("  * 600 Gramos Carne de res de carne molida ")
        SubTitleView("  * 2 Cucharadas Sazonador Líquido MAGGI®")
        SubTitleView("  * 2 Cucharadas Salsa Tipo Inglesa CROSSE & BLACKWELL®")
        SubTitleView("  * 1 Pieza Huevo ligeramente batido")
        SubTitleView("  * 1/4 Taza Cebolla picada finamente")
        SubTitleView("  * 1 Pieza Ajo picado finamente")
        SubTitleView("  * 1/4 Taza Pan molido")
        SubTitleView("  * 1 Paquete Queso tipo manchego cortado en cubos, 200 g")
        SubTitleView("  * 1 Paquete Tocino 250 g")
        SubTitleView("  * 5 Piezas Pan para hamburguesa con ajonjolí calientes")
        SubTitleView("  * 5 Hojas Lechuga sangría desinfectadas")
        SubTitleView("  * 1/2 Pieza Cebolla morada fileteada")
        SubTitleView("  * 1 Pieza Jitomate bola, rebanado")
        TitleView("¡A cocinar!")
        Text(text = "  1.Mezcla", fontSize = 30.sp, color = Color.White)
        SubTitleView("  En un tazón mezcla la carne con el Sazonador Líquido MAGGI®, la Salsa Tipo Inglesa CROSSE & BLACKWELL®, la cebolla, el huevo, el ajo y el pan molido. Forma bolitas y haz un hoyito con tu dedo, coloca dentro de ellas un cuadrito de queso tipo manchego. Cierra y forma las hamburguesas.")
        Text(text = "  2.Sirve", fontSize = 30.sp, color = Color.White)
        SubTitleView("  Envuelve las hamburguesas con el tocino y cocina en una sartén por ambos lados hasta que estén doradas. Toma un bollo y coloca la carne, la lechuga, la cebolla, el jitomate y acompaña con los aderezos de tu preferencia. Ofrece")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Navegacion("<", Color.Transparent, Color.White) {
                navController.navigate("hotdog")
            }
            Navegacion("O", Color.Transparent, Color.White) {
                navController.navigate("Home")
            }
            Navegacion(">", Color.Transparent, Color.White) {
                navController.navigate("chilerelleno")
            }
        }
    }
}