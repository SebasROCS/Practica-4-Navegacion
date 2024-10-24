package com.example.appnavegacion3en1.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.appnavegacion3en1.components.ActionButton
import com.example.appnavegacion3en1.components.MainButton
import com.example.appnavegacion3en1.components.Space
import com.example.appnavegacion3en1.components.TitleBar
import com.example.appnavegacion3en1.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Menú Principal") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        }
    ) {
        ContentHomeView(navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContentHomeView(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Menú Principal")
        Space()

        MainButton(name = "Años Perrunos", backColor = Color.Red, color = Color.White) {
            navController.navigate("AñosPerrunos")
        }

        MainButton(name = "Lotería", backColor = Color.Red, color = Color.White) {
            navController.navigate("Loteria")
        }

        MainButton(name = "Calculadora descuento", backColor = Color.Red, color = Color.White) {
            navController.navigate("CalculadoraDescuento")
        }
    }
}