package com.andersmurillo.weather.data

import com.andersmurillo.weather.data.model.WeatherModel
import com.andersmurillo.weather.data.network.WeatherService
import com.andersmurillo.weather.domain.model.Weather
import com.andersmurillo.weather.domain.model.toDomain
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val service: WeatherService) {

    suspend fun getWeatherFromApi(query:String):Weather {
        val response: WeatherModel = service.getWeather(query)
        return response.toDomain()
    }

}