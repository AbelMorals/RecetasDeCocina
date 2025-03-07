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
fun Hotdog(navController: NavController){
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
        ImagenCuadrada(R.drawable.chilidogs, "hotdog")
        TitleView("Hot Dog con Chili")
        Spacers()
        SubTitleView("Utensilios a usar")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ImagenChiquita(R.drawable.licuadora,"licuadora")
            SubTitleView("Licuadora")
            ImagenChiquita(R.drawable.cuchara,"cuchara")
            SubTitleView("Cuchara")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            ImagenChiquita(R.drawable.horno,"horno")
            SubTitleView("Horno")
            ImagenChiquita(R.drawable.cacerola,"cacerola")
            SubTitleView("Cacerola")
        }
        TitleView("Ingredientes")
        SubTitleView("  * 1 Cucharada de Jugo MAGGI®")
        SubTitleView("  * 2 Cucharadas de Salsa Inglesa CROSSE & BLACKWELL®")
        SubTitleView("  * 1 Cubo de Concentrado de Tomate con Pollo CONSOMATE®")
        SubTitleView("  * 1/2 Taza de agua")
        SubTitleView("  * 1 Taza de puré de tomate natural")
        SubTitleView("  * 5 Chiles guajillo sin semillas y remojados en agua caliente")
        SubTitleView("  * 1 Cucharada de aceite vegetal")
        SubTitleView("  * 1/4 De pieza de cebolla picada finamente")
        SubTitleView("  * 300 Gramos de carne de res molida molida")
        SubTitleView("  * 1 Lata de frijoles negros enteros y escurridos (480 g)")
        SubTitleView("  * 4 Salchichas asadas")
        SubTitleView("  * 4 Piezas de pan para hot dog calientes")
        SubTitleView("  * 200 Gramos de queso cheddar rallado")
        SubTitleView("  * Perejil desinfectado y picado finamente")
        TitleView("¡A cocinar!")
        Text(text = "  1.Prepara la salsa de chili", fontSize = 30.sp, color = Color.White)
        SubTitleView("Horno precalentado a 180 °C. Para el chili, licúa 1 cucharada de Jugo MAGGI® con 2 cucharadas de Salsa Inglesa CROSSE & BLACKWELL®, el Concentrado de Tomate con Pollo CONSOMATE®, el agua, el puré de tomate y los chiles.")
        Text(text = "  2.Cocina", fontSize = 30.sp, color = Color.White)
        SubTitleView("En una sartén, calienta 1 cucharada de aceite y fríe ¼ de cebolla picada hasta que esté transparente, añade la carne y cocina por 5 minutos. Agrega los frijoles con la salsa y cocina hasta que la carne esté cocida y hierva ligeramente.")
        Text(text = "  3.Prepara los hot dogs", fontSize = 30.sp, color = Color.White)
        SubTitleView("Coloca una salchicha en cada pan y agrega un poco de chili y queso cheddar; hornea por 5 minutos o hasta que gratine. Sirve, decora con perejil y ofrece.")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Navegacion("<", Color.Transparent, Color.White) {
                navController.navigate("burritos")
            }
            Navegacion("O", Color.Transparent, Color.White) {
                navController.navigate("Home")
            }
            Navegacion(">", Color.Transparent, Color.White) {
                navController.navigate("burger")
            }
        }
    }
}