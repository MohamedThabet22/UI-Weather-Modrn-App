@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.example.weatherapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.data.datatoday
import com.example.weatherapp.ui.theme.WeatherAppTheme

val listtodayweather = listOf(
    datatoday.today1,
    datatoday.today2,
    datatoday.today3,
    datatoday.today4,
    datatoday.today5,
    datatoday.today6,
)

@Preview(showBackground = true)
@Composable
fun TodaaySceen() {


    LazyRow {
        items(listtodayweather.size){ index ->
            Items(index = index)
        }

    }
}


@Composable
fun Items(index: Int) {
    val item = listtodayweather[index]

    var lastItemPaddingEnd = 0.dp
    if (index == listtodayweather.size - 1) {
        lastItemPaddingEnd = 20.dp
    }
    val backgroundModifier = if (item.isvisable) {
        Modifier.background(Color.White,shape = RoundedCornerShape(25.dp))
    } else {
        Modifier.background(
            Brush.verticalGradient(
                listOf(
                    Color(0xFFFFC107),
                    Color(0xFFD024DF),
                    Color(0xFFB224F0)
                )
            ),
            shape = RoundedCornerShape(20.dp)
        )
    }
    Box(
        modifier = Modifier
            .size(120.dp)
            .padding(start = 20.dp, end = lastItemPaddingEnd)
            .then(
                backgroundModifier
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "11%",
                fontSize = 14.sp,
                color =  if (item.isvisable)Color.Black else Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding( start = 2.dp, bottom = 5.dp)
            )
            Image(
                painter = painterResource(id = item.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
            )

            Text(
                text = "Rain",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = if (item.isvisable)Color.Black else Color.White,
                modifier =  Modifier.padding( start = 4.dp,top = 5.dp)
            )
        }
    }
}