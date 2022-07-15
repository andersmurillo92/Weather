package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.AstroModel
import com.andersmurillo.weather.data.model.ConditionModel
import com.andersmurillo.weather.data.model.DayModel

data class Day(
    var maxtemp_c:Float?,
    var maxtemp_f:Float?,
    var mintemp_c:Float?,
    var mintemp_f:Float?,
    var avgtemp_c:Float?,
    var avgtemp_f:Float?,
    var maxwind_mph:Float?,
    var maxwind_kph:Float?,
    var totalprecip_mm:Float?,
    var totalprecip_in:Float?,
    var avgvis_km:Float?,
    var avgvis_miles:Float?,
    var avghumidity:Float?,
    var daily_will_it_rain:Int?,
    var daily_chance_of_rain:Int?,
    var daily_will_it_snow:Int?,
    var daily_chance_of_snow:Int?,
    var condition:ConditionModel?,
    var uv:AstroModel?,
)

fun DayModel.toDomain() = Day(
    maxtemp_c,
    maxtemp_f,
    mintemp_c,
    mintemp_f,
    avgtemp_c,
    avgtemp_f,
    maxwind_mph,
    maxwind_kph,
    totalprecip_mm,
    totalprecip_in,
    avgvis_km,
    avgvis_miles,
    avghumidity,
    daily_will_it_rain,
    daily_chance_of_rain,
    daily_will_it_snow,
    daily_chance_of_snow,
    condition,
    uv
)
