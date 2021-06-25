package com.example.studentcollegemanagementsysapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Branches : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branches)

        var cse_classes = findViewById<ImageView>(R.id.cseicon_iv)
        var it_classes = findViewById<ImageView>(R.id.iticon_iv)
        var ece_classes = findViewById<ImageView>(R.id.eceicon_iv)

        cse_classes.setOnClickListener { view ->
            val intent = Intent(this,classesActivity::class.java)

            intent.putExtra("Branch name","cse")
            startActivity(intent)
        }
        it_classes.setOnClickListener { view ->
            val intent = Intent(this,classesActivity::class.java)

            intent.putExtra("Branch name","it")
            startActivity(intent)
        }
        ece_classes.setOnClickListener { view ->
            val intent = Intent(this,classesActivity::class.java)

            intent.putExtra("Branch name","ece")
            startActivity(intent)
        }
    }
}