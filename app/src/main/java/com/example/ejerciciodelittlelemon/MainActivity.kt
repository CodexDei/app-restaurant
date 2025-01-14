package com.example.ejerciciodelittlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejerciciodelittlelemon.ui.theme.EjercicioDeLittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioDeLittleLemonTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    RestaurantName(
                        name = stringResource(R.string.Titulo),
                        size = 24,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun RestaurantName(name: String, size: Int, modifier: Modifier = Modifier
                   ){

    Text(
        text = "Hello $name!",
        fontSize = size.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicioDeLittleLemonTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    EjercicioDeLittleLemonTheme {
        RestaurantName(name = "Little Lemon", size = 50 )
    }
}