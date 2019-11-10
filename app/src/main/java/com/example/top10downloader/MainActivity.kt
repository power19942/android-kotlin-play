package com.example.top10downloader

import android.app.Dialog
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var game = play_fragment()
        var test = settings_fragment()
        var posts = posts_fragment()
        nav.selectedItemId = R.id.home
        var m = supportFragmentManager.beginTransaction()
        m.replace(R.id.holder,posts)
        m.commit()

        nav.setOnNavigationItemSelectedListener { item->

            when(item.itemId){
                R.id.game -> {
                    var manager = supportFragmentManager.beginTransaction()
                    manager.replace(R.id.holder,game)
                    manager.commit()
                    true
                }
                R.id.test -> {
                    var manager = supportFragmentManager.beginTransaction()
                    manager.replace(R.id.holder,test)
                    manager.commit()
                    true
                }
                R.id.home -> {
                    var manager = supportFragmentManager.beginTransaction()
                    manager.replace(R.id.holder,posts)
                    manager.commit()
                    true
                }
                else -> true
            }
        }

    }

}
