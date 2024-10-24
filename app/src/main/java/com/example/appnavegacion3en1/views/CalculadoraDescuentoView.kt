package com.example.appnavegacion3en1.views

import android.annotation.SuppressLint
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appnavegacion3en1.calculadoraDescuento.CalculadoraDescuento
import com.example.appnavegacion3en1.components.MainIconButton
import com.example.appnavegacion3en1.components.TitleBar
import com.example.appnavegacion3en1.loteria.LoteriaView
import com.example.appnavegacion3en1.loteria.LoteriaViewModels

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CalcuView(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Regresar al menú principal") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) { paddingValues ->
        CalculadoraDescuento()
    }
}