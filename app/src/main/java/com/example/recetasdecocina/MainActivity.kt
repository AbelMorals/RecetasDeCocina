package com.example.recetasdecocina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.recetasdecocina.views.HomeView
import com.example.recetasdecocina.views.Albondigas
import com.example.recetasdecocina.views.Burger
import com.example.recetasdecocina.views.Burritos
import com.example.recetasdecocina.views.Hotdog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            enableEdgeToEdge()
        setContent {
            Burger()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HomeView()
}