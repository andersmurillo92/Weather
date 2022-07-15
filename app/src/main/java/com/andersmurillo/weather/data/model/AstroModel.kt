package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class AstroModel(
    @SerializedName("sunrise") var sunrise:String?,
    @SerializedName("sunset") var sunset:String?,
    @SerializedName("moonrise") var moonrise:String?,
    @SerializedName("moonset") var moonset:String?,
    @SerializedName("moon_phase") var moon_phase:String?,
    @SerializedName("moon_illumination") var moon_illumination:String?,
)