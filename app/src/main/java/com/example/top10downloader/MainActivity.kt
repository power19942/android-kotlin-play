package com.example.top10downloader

import android.app.Dialog
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var item = ArrayList<CustomItem>()
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        item.add(CustomItem("Android List",R.drawable.img))
        item.add(CustomItem("stupid list",R.drawable.img2))
        var adapter = CustomAdapter(item,applicationContext)
        list.layoutManager = GridLayoutManager(applicationContext,4)
        list.adapter = adapter
    }

}
