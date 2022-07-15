package com.andersmurillo.weather.data.model

import com.google.gson.annotations.SerializedName

data class ConditionModel(
    @SerializedName("text") var text:String?,
    @SerializedName("icon") var icon:String?,
    @SerializedName("code") var code:Int?,
)