package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nButton = findViewById<View>(R.id.thirdActivity) as ImageButton
        //handle onClick
        nButton.setOnClickListener {
            //intent to start NewActivity
            startActivity(Intent(this@MainActivity2, MainActivity3::class.java))
        }
    }
}