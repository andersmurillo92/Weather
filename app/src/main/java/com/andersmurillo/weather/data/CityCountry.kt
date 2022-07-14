package com.andersmurillo.weather.data

import com.google.gson.annotations.SerializedName

data class CityCountry(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("region") val region: String,
    @SerializedName("country") val country: String
)
