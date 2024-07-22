package com.example.weatherapp.data

import androidx.annotation.DrawableRes
import com.example.weatherapp.R

sealed class datatoday (

    val  time : String,
    val icon :  Int,
    val  Temperature : String,
    val isvisable : Boolean ,
){

    data object  today1 : datatoday(
        time = "9 am",
        icon = R.drawable.wea5,
        Temperature = "37°",
        isvisable =  false
    )
    data object  today2 : datatoday(
        time = "10 am",
        icon = R.drawable.wea3,
        Temperature = "34°",
        isvisable =  true
    )
    data object  today3 : datatoday(
        time = "11 am",
        icon = R.drawable.wea4,
        Temperature = "30°",
        isvisable =  true
    )
    data object  today4: datatoday(
        time = "12 am",
        icon = R.drawable.wea3,
        Temperature = "33°",
        isvisable =  true
    )
    data object  today5 : datatoday(
        time = "1 pm",
        icon = R.drawable.wea2,
        Temperature = "29°",
        isvisable =  true
    )
    data object  today6 : datatoday(
        time = "2 am",
        icon = R.drawable.wea4,
        Temperature = "22°",
        isvisable =  true
    )
}