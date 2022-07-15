package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class LocationModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("region") val region: String,
    @SerializedName("country") val country: String
)
