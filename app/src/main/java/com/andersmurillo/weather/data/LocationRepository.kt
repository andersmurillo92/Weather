package com.andersmurillo.weather.data

import com.andersmurillo.weather.data.model.LocationModel
import com.andersmurillo.weather.data.network.LocationService
import com.andersmurillo.weather.domain.model.Location
import com.andersmurillo.weather.domain.model.toDomain
import javax.inject.Inject

class LocationRepository @Inject constructor(private val api: LocationService) {

    suspend fun getLocationsFromApi(query: String): List<Location> {
        val response: List<LocationModel> = api.getLocations(query)
        return response.map { it.toDomain() }
    }
}