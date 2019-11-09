package com.example.top10downloader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context:Context,data:ArrayList<ItemClass>) : ArrayAdapter<ItemClass>(context,0,data){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View? = convertView
        itemView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        var item : ItemClass? = getItem(position)
        var title :TextView = itemView.findViewById(R.id.item_title)
        title.text = item!!.title
        var img :ImageView = itemView.findViewById(R.id.item_image)
        img.setImageResource(item.image)
        return  itemView
    }


}