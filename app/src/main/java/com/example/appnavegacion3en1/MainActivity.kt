package com.example.appnavegacion3en1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.appnavegacion3en1.loteria.LoteriaView
import com.example.appnavegacion3en1.loteria.LoteriaViewModels
import com.example.appnavegacion3en1.navigation.NavManager
import com.example.appnavegacion3en1.ui.theme.AppNavegacion3en1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AppNavegacion3en1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AñosPerrunos()
                    //LoteriaView(viewModel = viewModel)
                    NavManager()
                }
            }
        }
    }
}
