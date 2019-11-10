package com.example.top10downloader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(data: ArrayList<CustomItem>, var context: Context) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layout = LayoutInflater.from(context).inflate(R.layout.item_template, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.img.setImageResource(data[position].image ?: 0)
        holder.card.setOnClickListener {
            Toast.makeText(context,data[position].title,Toast.LENGTH_LONG).show()
        }
    }

    var data: List<CustomItem> = data

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)
        var img: ImageView = itemView.findViewById(R.id.profile_image)
        var card : CardView = itemView.findViewById(R.id.card)
    }


}