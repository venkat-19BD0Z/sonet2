package com.example.studentcollegemanagementsysapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class classesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classes)

        var id: String? = intent.getStringExtra("Branch name")
        Toast.makeText(this@classesActivity,"$id classes"  ,Toast.LENGTH_SHORT).show()

        var dm = DataManager()
        var classesList = findViewById<ListView>(R.id.classes_lv)
        when (id){
            "cse" ->  classesList.adapter = ArrayAdapter<classInfo>(this,android.R.layout.simple_list_item_1,dm.cse_class)
            "it" ->  classesList.adapter = ArrayAdapter<classInfo>(this,android.R.layout.simple_list_item_1,dm.it_class)
            "ece" ->  classesList.adapter = ArrayAdapter<classInfo>(this,android.R.layout.simple_list_item_1,dm.ece_class)
        }


        var back = findViewById<Button>(R.id.Back)
        back.setOnClickListener { view ->
            val intent = Intent(this,Screen1Activity::class.java)
            startActivity(intent)
        }

    }
}