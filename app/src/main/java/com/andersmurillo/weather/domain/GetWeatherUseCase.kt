package com.andersmurillo.weather.domain

import android.util.Log
import com.andersmurillo.weather.data.WeatherRepository
import com.andersmurillo.weather.domain.model.Weather
import javax.inject.Inject

private const val TAG = "GetWeatherUseCase"

class GetWeatherUseCase @Inject constructor(private val repository: WeatherRepository) {
    suspend operator fun invoke(query:String): Weather? = try {
        repository.getWeatherFromApi(query)
    } catch (ex:Exception){
        Log.i(TAG, ex.toString())
        null
    }
}