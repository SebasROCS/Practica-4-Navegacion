package com.example.appnavegacion3en1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.appnavegacion3en1.AñosPerrunos.AñosPerrunos
import com.example.appnavegacion3en1.loteria.LoteriaView
import com.example.appnavegacion3en1.views.AñosPerrunosView
import com.example.appnavegacion3en1.views.CalcuView
import com.example.appnavegacion3en1.views.HomeView
import com.example.appnavegacion3en1.views.LotoView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"  ){
        composable("Home"){
            HomeView(navController)
        }
        composable("AñosPerrunos"){
            AñosPerrunosView(navController)
        }

        composable("Loteria"){
            LotoView(navController)
        }

        composable("CalculadoraDescuento"){
            CalcuView(navController)
        }

    }
}