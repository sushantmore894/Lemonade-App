package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mButton = findViewById<View>(R.id.secondActivity) as ImageButton
        //handle onClick
        mButton.setOnClickListener {
            //intent to start NewActivity
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }
    }
    }
