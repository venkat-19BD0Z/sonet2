package com.example.studentcollegemanagementsysapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Screen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        var online_classes = findViewById<ImageView>(R.id.onlineClasses_iv)
        online_classes.setOnClickListener { view ->
            val intent = Intent(this,Branches::class.java)
            startActivity(intent)
        }

    }
}