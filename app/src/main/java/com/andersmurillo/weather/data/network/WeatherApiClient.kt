package com.andersmurillo.weather.data.network

import com.andersmurillo.weather.data.model.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiClient {
    @GET("forecast.json?key=de5553176da64306b86153651221606")
    suspend fun getWeather(@Query("q") q : String, @Query("days") days:Int = 3): Response<WeatherModel>
}