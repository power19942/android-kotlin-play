package com.example.top10downloader

import android.app.Dialog
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list_view)
        var item = ArrayList<ItemClass>()
        item.add(ItemClass("Android List",R.drawable.img))
        item.add(ItemClass("stupid list",R.drawable.img2))
        item.add(ItemClass("Android List",R.drawable.img))
        item.add(ItemClass("stupid list",R.drawable.img2))

        var addater = CustomAdapter(this@MainActivity,item);
        list.adapter = addater
        list.onItemClickListener = AdapterView.OnItemClickListener{parent,view,pos,id->
            val alert = Dialog(this@MainActivity)
            alert.setContentView(R.layout.custom_alert)
            val title = alert.findViewById<TextView>(R.id.dialog_txt)
            val img = alert.findViewById<ImageView>(R.id.dialog_img)
            val btn = alert.findViewById<Button>(R.id.dialog_button)
            val item: ItemClass? = addater.getItem(pos)
            title.text = item?.title
            img.setImageResource(item?.image ?: R.drawable.img2)
            btn.setOnClickListener{
                alert.dismiss()
            }
            alert.show()
        }
    }

}
