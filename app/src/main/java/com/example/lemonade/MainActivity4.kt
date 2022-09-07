package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val pButton = findViewById<View>(R.id.firstActivity) as ImageButton
        //handle onClick
        pButton.setOnClickListener {
            //intent to start NewActivity
            startActivity(Intent(this@MainActivity4, MainActivity::class.java))
        }
    }
}