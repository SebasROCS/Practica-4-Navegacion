package com.example.appnavegacion3en1.calculadoraDescuento

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appnavegacion3en1.calculadoraDescuento.Alerta
import com.example.appnavegacion3en1.calculadoraDescuento.BotonReutilizable
import com.example.appnavegacion3en1.calculadoraDescuento.DosTarjetas
import com.example.appnavegacion3en1.calculadoraDescuento.SpaceH
import com.example.appnavegacion3en1.calculadoraDescuento.TextFields

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CalculadoraDescuento()
{
    Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                title = {Text(text="App Descuento", color = Color.White)},

                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ))}

    )
    {
        ContentHomeView(it)
    }

}

@Composable
fun ContentHomeView(paddingValues: PaddingValues)
{
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        var precio by remember { mutableStateOf("") }
        var descuento by remember { mutableStateOf("") }
        var precioTotal by remember { mutableStateOf("") }
        var descuentoTotal by remember { mutableStateOf("") }

        var showAlert by remember { mutableStateOf(false) } // Estado para controlar la alerta

        DosTarjetas(titulo1 = "Total", numero1 = precioTotal, titulo2 = "Descuento", numero2 = descuentoTotal)
        TextFields(value = precio, onValueChange = {precio = it}, label = "")
        SpaceH()
        TextFields(value = descuento, onValueChange = {descuento = it}, label = "")
        SpaceH(10.dp)
        BotonReutilizable(text = "Calcular") {
            if(precio != ""){
                descuentoTotal=(precio.toDouble() * descuento.toDouble() / 100).toString()
                precioTotal = (precio.toDouble() - descuentoTotal.toDouble()).toString()
            }else
            {
                showAlert = true
            }

        }
        SpaceH(10.dp)
        BotonReutilizable(text = "Limpiar") {
            precioTotal = "0.0"
            descuentoTotal = "0.0"
            precio = "0.0"
            descuento = "0.0"
        }

        if(showAlert){
            Alerta(
                title = "Sistema",
                mensaje = "Falta un valor.",
                mensajeConfirma = "Aceptar",
                onConfirmClick = { showAlert = false },
                onDismissClick = { showAlert = false }
            )
        }
    }
}