package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class DayModel(
    @SerializedName("maxtemp_c") var maxtemp_c:Float?,
    @SerializedName("maxtemp_f") var maxtemp_f:Float?,
    @SerializedName("mintemp_c") var mintemp_c:Float?,
    @SerializedName("mintemp_f") var mintemp_f:Float?,
    @SerializedName("avgtemp_c") var avgtemp_c:Float?,
    @SerializedName("avgtemp_f") var avgtemp_f:Float?,
    @SerializedName("maxwind_mph") var maxwind_mph:Float?,
    @SerializedName("maxwind_kph") var maxwind_kph:Float?,
    @SerializedName("totalprecip_mm") var totalprecip_mm:Float?,
    @SerializedName("totalprecip_in") var totalprecip_in:Float?,
    @SerializedName("avgvis_km") var avgvis_km:Float?,
    @SerializedName("avgvis_miles") var avgvis_miles:Float?,
    @SerializedName("avghumidity") var avghumidity:Float?,
    @SerializedName("daily_will_it_rain") var daily_will_it_rain:Int?,
    @SerializedName("daily_chance_of_rain") var daily_chance_of_rain:Int?,
    @SerializedName("daily_will_it_snow") var daily_will_it_snow:Int?,
    @SerializedName("daily_chance_of_snow") var daily_chance_of_snow:Int?,
    @SerializedName("condition") var condition:ConditionModel?,
    @SerializedName("uv") var uv:AstroModel?,
)