package com.andersmurillo.weather.data.network

import com.andersmurillo.weather.data.model.LocationModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationApiClient {
    @GET("search.json?key=de5553176da64306b86153651221606")
    suspend fun getLocations(@Query("q") q : String): Response<List<LocationModel>>
}