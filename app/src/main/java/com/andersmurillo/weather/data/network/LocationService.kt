package com.andersmurillo.weather.data.network

import com.andersmurillo.weather.data.model.LocationModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationService @Inject constructor(private val api:LocationApiClient) {

    suspend fun getLocations(query: String): List<LocationModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getLocations(query)
            response.body() ?: emptyList()
        }
    }
}