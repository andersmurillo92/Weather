package com.andersmurillo.weather.views.searcher

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andersmurillo.weather.domain.GetLocationsUseCase
import com.andersmurillo.weather.domain.GetWeatherUseCase
import com.andersmurillo.weather.domain.model.Location
import com.andersmurillo.weather.domain.model.Weather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getLocationsUseCase: GetLocationsUseCase,
    private val getWeatherUseCase: GetWeatherUseCase
) : ViewModel() {

    companion object{
        private const val TAG = "SearchViewModel"
    }

    val locationsModel = MutableLiveData<List<Location>>()
    val locationWeather = MutableLiveData<Weather>()
    val isLoading = MutableLiveData<Boolean>()

    init {

    }

    fun onCreate(query: String) {
        viewModelScope.launch {
            try {
                isLoading.postValue(true)
                val result: List<Location> = getLocationsUseCase(query)

                if (!result.isNullOrEmpty()) {
                    locationsModel.postValue(result)
                    isLoading.postValue(false)
                }
            } catch (ex:Exception) {
                Log.i(TAG, ex.toString())
            }
        }
    }

    fun getLocationWeather(query:String) {
        viewModelScope.launch {
            val result: Weather? = getWeatherUseCase(query)
            if(result!=null)
                locationWeather.value = result!!
        }
    }
}