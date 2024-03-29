package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val adminMenuBtn = findViewById<Button>(R.id.adminMenuBtn)

        adminMenuBtn.setOnClickListener {
            val myIntent = Intent(this, AdminActivity::class.java)
            startActivity(myIntent)
        }
    }
}