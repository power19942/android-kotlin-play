package com.example.top10downloader

import android.app.Dialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var openBtn : Button = findViewById(R.id.btn)

        openBtn.setOnClickListener{it
            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,548)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 548){
            var img = data!!.extras?.get("data") as Bitmap
            val image = findViewById<ImageView>(R.id.imageView2)
            image.setImageBitmap(img)
        }
    }

}
