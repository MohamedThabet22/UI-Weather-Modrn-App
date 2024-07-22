package com.example.weatherapp.screen2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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


@Preview(showBackground = true,)
@Composable
fun CardNextScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .padding(10.dp)
            .background(
                brush =
                Brush.linearGradient(
                    listOf(
                        Color(0xFFB224F0),
                        Color(0xFFCA3BD6),  // لون #CA3BD6
                        Color(0xFFFFC107),


                        )
                ),
                shape = RoundedCornerShape(18.dp)
            )
    ) {


        Row (
            modifier =  Modifier.padding(start =  15.dp , top =  30.dp, end = 15.dp)
                .fillMaxWidth(),
            horizontalArrangement =  Arrangement.Start
        ){
            Image(painter = painterResource(id = R.drawable.wea5), contentDescription = null,
                modifier =  Modifier
                    .size(130.dp)
            )

            Column {
                Text(text = "Tommorow"
                , fontSize = 19.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start =  50.dp))


                Text(text = "39°"
                    , fontSize = 40.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start =  50.dp, top =  15.dp,
                        bottom =  15.dp))

                Text(text = "Periodic clouds"
                    , fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start =  50.dp))
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 40.dp)
                .paddingFromBaseline(20.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

            Column(
            ) {

                Image(
                    painter = painterResource(id = R.drawable.rain),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                )
                Text(
                    text = "11%",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp, start = 2.dp)
                )
                Text(
                    text = "Rain",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier =  Modifier.padding( start = 4.dp)
                )


            }
            Column(
            ) {

                Image(
                    painter = painterResource(id = R.drawable.windy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                )
                Text(
                    text = "9 km/h",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp, start = 2.dp)
                )
                Text(
                    text = "Wiend speed",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier =  Modifier.padding(   top = 5.dp)
                )


            }
            Column(
            ) {

                Image(
                    painter = painterResource(id = R.drawable.humidity),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                )
                Text(
                    text = "8%",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 8.dp, start = 2.dp)
                )
                Text(
                    text = "humidity",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier =  Modifier.padding( start = 4.dp)
                )


            }


        }
    }
}