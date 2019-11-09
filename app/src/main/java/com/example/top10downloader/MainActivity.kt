package com.example.top10downloader

import android.app.Dialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var openBtn : Button = findViewById(R.id.btn)

        openBtn.setOnClickListener{it
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+"54545121"))
            intent.putExtra("sms_body","hellow")
            startActivity(intent)
        }

    }



}
