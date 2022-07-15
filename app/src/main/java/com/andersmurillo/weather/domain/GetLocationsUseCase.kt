package com.andersmurillo.weather.domain

import com.andersmurillo.weather.data.LocationRepository
import com.andersmurillo.weather.domain.model.Location
import javax.inject.Inject

class GetLocationsUseCase @Inject constructor(private val repository: LocationRepository) {
    suspend operator fun invoke(query: String):List<Location>{
        val locations: List<Location> = repository.getLocationsFromApi(query)
        return locations
    }
}