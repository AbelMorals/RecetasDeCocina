package com.example.recetasdecocina.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recetasdecocina.views.Albondigas
import com.example.recetasdecocina.views.Burger
import com.example.recetasdecocina.views.Burritos
import com.example.recetasdecocina.views.ChileRelleno
import com.example.recetasdecocina.views.HomeView
import com.example.recetasdecocina.views.Hotdog

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }

        composable("albondigas"){
            Albondigas(navController)
        }

        composable("burritos"){
            Burritos(navController)
        }

        composable("hotdog"){
            Hotdog(navController)
        }

        composable("burger"){
            Burger(navController)
        }

        composable("chilerelleno"){
            ChileRelleno(navController)
        }
    }
}