package com.example.weatherapp.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun  linedayscreen( onClick : (visavel : Boolean) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start =  20.dp , end = 20.dp , top = 10.dp,
                bottom = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){

        Text(
            text = "Today", fontSize = 20.sp,
            color = Color(0xFF07021F),
            fontWeight = FontWeight.Bold,

            )

        Text(
            text = "Next 7 Day>", fontSize = 18.sp,
            color = Color(0xFF07021F),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                onClick(false)
            }
            )

    }
}