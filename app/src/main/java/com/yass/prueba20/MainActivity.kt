package com.yass.prueba20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yass.prueba20.ui.theme.Prueba20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba20Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PruebaBox(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PruebaBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Fila1 Arriba Izda",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Fila2 Medio Centro",
            modifier = Modifier.align(Alignment.Center)
        )
        Text(
            text = "Fila3 Abajo Derecha",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PruebaBoxPreview() {
        PruebaBox()

}


