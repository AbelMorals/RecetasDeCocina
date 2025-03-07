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
fun ChileRelleno(navController: NavController){
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
        ImagenCuadrada(R.drawable.stuffed_chileschiles_rellenos, "chilerelleno")
        TitleView("Chiles Rellenos")
        Spacers()
        SubTitleView("Utensilios a usar")
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
        SubTitleView("  1 Cucharada de Aceite maíz")
                SubTitleView("  * 500 Gramos de Carne molida de res")
                SubTitleView("  * 1/2 Taza de Almendra fileteada")
                SubTitleView("  * 1/2 Cucharadita de Comino")
                SubTitleView("  * 1 Cucharada de Sal")
                SubTitleView("  * 1/2 Cucharadita de Pimienta negra")
                SubTitleView("  * 1 Tableta de Chocolate para mesa ABUELITA® rallada")
                SubTitleView("  * 8 Piezas de Chile ancho remojados en agua caliente y sin semilla")
                SubTitleView("  * 1/2 Paquete de Queso tipo manchego")
                SubTitleView("  * 3 Ramitas de Cilantro fresco picado finamente")
                SubTitleView("  * 1 Caja Media Crema NESTLÉ® refrigerada")
        TitleView("¡A cocinar!")
        Text(text = "  1.Cocina", fontSize = 30.sp, color = Color.White)
        SubTitleView("  En una sartén caliente vierte el aceite, asa la carne de res con las almendras, el comino, la sal, la pimienta y el Chocolate para mesa ABUELITA®.")
        Text(text = "  2.Coloca", fontSize = 30.sp, color = Color.White)
        SubTitleView("  Coloca un poco de la carne dentro de los chiles y coloca un poco de queso rallado.")
        Text(text = "  3.Calienta", fontSize = 30.sp, color = Color.White)
        SubTitleView("  Calienta en el microondas por 30 segundos o hasta que el queso este derretido. Decora con un poco de cilantro picado y la Media Crema NESTLÉ® . Sirve y ofrece.")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Navegacion("<", Color.Transparent, Color.White) {
                navController.navigate("burger")
            }
            Navegacion("O", Color.Transparent, Color.White) {
                navController.navigate("Home")
            }
            Navegacion(">", Color.Transparent, Color.White) {
                navController.navigate("albondigas")
            }
        }
    }
}