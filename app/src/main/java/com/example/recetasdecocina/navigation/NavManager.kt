package com.example.recetasdecocina.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recetasdecocina.views.Albondigas
import com.example.recetasdecocina.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }

        composable("Albondigas"){
            Albondigas(navController)
        }
    }
}