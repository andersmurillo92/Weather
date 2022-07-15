package com.andersmurillo.weather.data.network

import com.andersmurillo.weather.data.model.WeatherModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherService @Inject constructor(private val api:WeatherApiClient) {

    suspend fun getWeather(query:String):WeatherModel{
        return withContext(Dispatchers.IO){
            val response = api.getWeather(query)
            response.body()!!
        }
    }
}