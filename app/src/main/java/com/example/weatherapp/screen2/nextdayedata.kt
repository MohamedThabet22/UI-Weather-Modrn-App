package com.example.weatherapp.screen2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.data.nextdaydata

val listtodayweather = listOf(
    nextdaydata.today1,
    nextdaydata.today2,
    nextdaydata.today3,
    nextdaydata.today4,
    nextdaydata.today5,
)


@Preview(showBackground = true,)
@Composable
fun NextDayedata(){
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        val boxWithConstraintsScope = this
        val with = boxWithConstraintsScope.maxWidth / 4

        LazyColumn {
            items(listtodayweather.size) {index  ->

                Itmes(index = index, with = with)
            }
        }
    }
}

@Composable
fun Itmes(index: Int , with : Dp) {

    val item = listtodayweather[index]

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = item.namedaty,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp)
                .width(with)

        )
        Image(
            painter = painterResource(id = item.icon),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .padding(start = 10.dp)
                .width(with)
        )
        Text(
            text = item.time,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 10.dp)
                .width(with)

        )
        Text(
            text = item.Temperature,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 50.dp)
                .width(with)

        )

    }

}
