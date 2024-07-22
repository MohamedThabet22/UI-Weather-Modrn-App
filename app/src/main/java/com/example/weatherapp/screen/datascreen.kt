package com.example.weatherapp.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.ui.theme.WeatherAppTheme


@Preview(showBackground = true, device = "id:Nexus One")
@Composable
fun dataScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Text(
            text = "Egypt",
            fontSize = 40.sp,
            color = Color(0xFF2D376D),
            modifier = Modifier.padding(bottom = 0.dp)

        )

        Image(
            painter = painterResource(id = R.drawable.wea3),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 54.dp)
                .size(260.dp)
        )
        Text(
            text = "Mon July 21 | 9:00 AM",
            fontSize = 20.sp,
            color = Color(0xFF2D376D),

            modifier = Modifier.padding(bottom = 19.dp)
        )

        Text(
            text = "35°", fontSize = 60.sp,
            color = Color(0xFF07021F),
            fontWeight = FontWeight.Bold,

            )
            Text(text = "H:29 L:16",
                fontSize = 14.sp,
                color = Color(0xFF495387),

                )


    }
}