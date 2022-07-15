package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.AstroModel

data class Astro(
    var sunrise:String?,
    var sunset:String?,
    var moonrise:String?,
    var moonset:String?,
    var moon_phase:String?,
    var moon_illumination:String?,
)

fun AstroModel.toDomain() = Astro(
    sunrise,
    sunset,
    moonrise,
    moonset,
    moon_phase,
    moon_illumination
)