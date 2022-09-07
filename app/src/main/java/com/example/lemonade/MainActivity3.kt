package com.example.lemonade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val oButton = findViewById<View>(R.id.forthActivity) as ImageButton
        //handle onClick
        oButton.setOnClickListener {
            //intent to start NewActivity
            startActivity(Intent(this@MainActivity3, MainActivity4::class.java))
        }
    }
}