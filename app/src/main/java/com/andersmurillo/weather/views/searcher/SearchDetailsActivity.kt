package com.andersmurillo.weather.views.searcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.andersmurillo.weather.databinding.ActivitySearchDetailsBinding
import com.andersmurillo.weather.domain.model.Location
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchDetailsActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SearchDetailsActivity"
    }

    private lateinit var binding: ActivitySearchDetailsBinding
    private val viewModel:SearchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        initViewModelObservables()
    }

    private fun initView() {
        val locationSelected = intent?.getSerializableExtra("item") as Location
        viewModel.getLocationWeather(locationSelected.name)
    }

    private fun initViewModelObservables(){
        viewModel.locationWeather.observe(this, Observer {
            Log.i(TAG, "$it")
        })
    }
}