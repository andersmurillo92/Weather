package com.andersmurillo.weather.domain.model

import com.andersmurillo.weather.data.model.LocationModel
import java.io.Serializable

data class Location (val id:Int, val name:String, val region:String, val country:String):Serializable

fun LocationModel.toDomain() = Location(id, name, region, country)