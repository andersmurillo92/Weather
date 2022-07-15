package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class ForecastModel(
    @SerializedName("date") var date:String?,
    @SerializedName("date_epoch") var date_epoch:String?,
    @SerializedName("day") var day:DayModel?,
    @SerializedName("astro") var astro:AstroModel?,
    @SerializedName("hour") var hour:List<HourModel>?,
)