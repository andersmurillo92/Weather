package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.HourModel
import com.andersmurillo.weather.data.model.LocationModel
import com.andersmurillo.weather.data.model.WeatherModel

data class Weather (
    val location: Location,
    val current:Hour,
    val forecast: Forecast
)

fun WeatherModel.toDomain() = Weather(location.toDomain(), current.toDomain(), forecast.toDomain())