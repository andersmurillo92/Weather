package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.ConditionModel
import com.andersmurillo.weather.data.model.HourModel
import com.google.gson.annotations.SerializedName

data class Hour(
    var last_updated_epoch:String?,
    var last_updated:String?,
    var temp_c:Float?,
    var temp_f:Float?,
    var is_day:Int?,
    var condition: ConditionModel?,
    var wind_mph:String?,
    var wind_kph:String?,
    var wind_degree:String?,
    var wind_dir:String?,
    var pressure_mb:String?,
    var pressure_in:String?,
    var precip_mm:String?,
    var precip_in:String?,
    var humidity:String?,
    var cloud:String?,
    var feelslike_c:String?,
    var feelslike_f:String?,
    var vis_km:String?,
    var vis_miles:String?,
    var uv:String?,
    var gust_mph:String?,
    var gust_kph:String?,
)

fun HourModel.toDomain() = Hour(
    last_updated_epoch,
     last_updated,
     temp_c,
     temp_f,
     is_day,
     condition,
     wind_mph,
     wind_kph,
     wind_degree,
     wind_dir,
     pressure_mb,
     pressure_in,
     precip_mm,
     precip_in,
     humidity,
     cloud,
     feelslike_c,
     feelslike_f,
     vis_km,
     vis_miles,
     uv,
     gust_mph,
     gust_kph,
)

