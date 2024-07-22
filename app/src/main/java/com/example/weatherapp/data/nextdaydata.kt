package com.example.weatherapp.data

import com.example.weatherapp.R

sealed class nextdaydata (

    val  time : String,
    val icon :  Int,
    val  Temperature : String,
    val namedaty : String ,

){

    data object  today1 : nextdaydata(
        time = "Cloudy",
        icon = R.drawable.wea5,
        Temperature = "37°",
        namedaty = "Mon"
    )
    data object  today2 : nextdaydata(
        time = "Windy",
        icon = R.drawable.wea3,
        Temperature = "34°",
        namedaty = "Tue"
    )
    data object  today3 : nextdaydata(
        time = "Stormy",
        icon = R.drawable.wea4,
        Temperature = "30°",
        namedaty = "Wed"
    )
    data object  today4: nextdaydata(
        time = "Snowy",
        icon = R.drawable.wea3,
        Temperature = "33°",
        namedaty = "Thu"
    )
    data object  today5 : nextdaydata(
        time = "Cloudy",
        icon = R.drawable.wea2,
        Temperature = "29°",
        namedaty = "Fri"
    )
    data object  today6 : nextdaydata(
        time = "Stormy",
        icon = R.drawable.wea4,
        Temperature = "22°",
        namedaty =  "Sat"
    )
}