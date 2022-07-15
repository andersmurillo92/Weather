package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class WeatherModel(
    @SerializedName("location") var location: LocationModel,
    @SerializedName("current") var current:HourModel,
    @SerializedName("forecast") var forecast:ForecastModel
)