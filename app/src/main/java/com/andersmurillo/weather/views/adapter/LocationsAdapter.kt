package com.andersmurillo.weather.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andersmurillo.weather.R
import com.andersmurillo.weather.domain.model.Location
import com.andersmurillo.weather.util.ItemActionListener
import kotlinx.android.synthetic.main.item_location.view.*

class LocationAdapter (private val itemActionListener: ItemActionListener) : RecyclerView.Adapter<LocationAdapter.ViewHolder>() {

    private val locations: ArrayList<Location> = arrayListOf()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = locations[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            itemActionListener.onClick(item, position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_location, parent, false))
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(location: Location) {
            itemView.tvCityCountry.text = location.name
        }
    }

    fun updateData(items:List<Location>){
        locations.clear()
        locations.addAll(items)
        notifyDataSetChanged()
    }

}