package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.screen.CardScreen
import com.example.weatherapp.screen.TodaaySceen
import com.example.weatherapp.screen.dataScreen
import com.example.weatherapp.screen.linedayscreen
import com.example.weatherapp.screen2.nextdayScreen
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                App()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun App() {
    val isVisible = rememberSaveable { mutableStateOf(true) }
    if (isVisible.value) {
        WeatherUi(isVisible = isVisible)
    } else {
        nextdayScreen {
            isVisible.value = it
        }
    }


}


@Composable
fun WeatherUi(isVisible: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8EDFD)),

        ) {
        dataScreen()
        CardScreen()
        linedayscreen { visibility -> isVisible.value = visibility }
        TodaaySceen()
    }
}