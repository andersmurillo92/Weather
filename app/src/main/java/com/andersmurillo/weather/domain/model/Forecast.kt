package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.ForecastModel

data class Forecast(
    var date:String?,
    var date_epoch:String?,
    var day: Day?,
    var astro: Astro?,
    var hour:List<Hour>?,
)

fun ForecastModel.toDomain() = Forecast(
    date,
    date_epoch,
    day?.toDomain(),
    astro?.toDomain(),
    hour?.map { i -> i.toDomain() }
)