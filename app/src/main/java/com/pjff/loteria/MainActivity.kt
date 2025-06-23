package com.pjff.loteria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.pjff.loteria.ui.theme.LoteriaTheme
import com.pjff.loteria.viewModels.ContadorViewModel
import com.pjff.loteria.viewModels.LoteriaViewModel
import com.pjff.loteria.views.Contador
import com.pjff.loteria.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Vid 71, Invocamos nuestro view model
        //val viewModel : ContadorViewModel by viewModels()
        val viewModel : LoteriaViewModel by viewModels()
        setContent {
            LoteriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Vid 70 ,nuestro contador
                    // Contador(viewModel = viewModel)
                    //Vid 73
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}