package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class HourModel(
    @SerializedName("last_updated_epoch") var last_updated_epoch:String?,
    @SerializedName("last_updated") var last_updated:String?,
    @SerializedName("temp_c") var temp_c:Float?,
    @SerializedName("temp_f") var temp_f:Float?,
    @SerializedName("is_day") var is_day:Int?,
    @SerializedName("condition") var condition:ConditionModel?,
    @SerializedName("wind_mph") var wind_mph:String?,
    @SerializedName("wind_kph") var wind_kph:String?,
    @SerializedName("wind_degree") var wind_degree:String?,
    @SerializedName("wind_dir") var wind_dir:String?,
    @SerializedName("pressure_mb") var pressure_mb:String?,
    @SerializedName("pressure_in") var pressure_in:String?,
    @SerializedName("precip_mm") var precip_mm:String?,
    @SerializedName("precip_in") var precip_in:String?,
    @SerializedName("humidity") var humidity:String?,
    @SerializedName("cloud") var cloud:String?,
    @SerializedName("feelslike_c") var feelslike_c:String?,
    @SerializedName("feelslike_f") var feelslike_f:String?,
    @SerializedName("vis_km") var vis_km:String?,
    @SerializedName("vis_miles") var vis_miles:String?,
    @SerializedName("uv") var uv:String?,
    @SerializedName("gust_mph") var gust_mph:String?,
    @SerializedName("gust_kph") var gust_kph:String?,
)