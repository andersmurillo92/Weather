package com.andersmurillo.weather.views.searcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andersmurillo.weather.databinding.ActivitySearchBinding
import com.andersmurillo.weather.domain.model.Location
import com.andersmurillo.weather.util.ItemActionListener
import com.andersmurillo.weather.views.adapter.LocationAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchActivity : AppCompatActivity(), SearchView.OnQueryTextListener, ItemActionListener {

    private lateinit var binding : ActivitySearchBinding
    private val searchViewModel: SearchViewModel by viewModels()
    private lateinit var locationAdapter:LocationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        initRecyclerView()
        binding.searchView.setOnQueryTextListener(this)
    }

    private fun searchByName(query: String) {
        searchViewModel.onCreate(query)

        searchViewModel.locationsModel.observe(this, Observer {
            Log.d("Result", it.toString())
            locationAdapter.updateData(it)
        })

        searchViewModel.isLoading.observe(this, Observer {
            onLoading(it)
        })
    }

    private fun initRecyclerView(){
        locationAdapter = LocationAdapter(this)
        with(binding.recyclerLocations){
            layoutManager = LinearLayoutManager(this@SearchActivity, RecyclerView.VERTICAL, false)
            adapter = locationAdapter
        }
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            searchByName(query.toLowerCase())
        }
        return true
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        return true
    }

    override fun onClick(item: Any, position: Int) {
        val intent = Intent(this, SearchDetailsActivity::class.java).apply {
            putExtra("item", item as Location)
        }
        startActivity(intent)
    }

    private fun onLoading(value:Boolean){
        with(binding.loading){
            visibility = if(value) View.VISIBLE else View.GONE
        }
    }
}
