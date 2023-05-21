package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        val changeAdminBtn = findViewById<Button>(R.id.changeAdminBtn)

        changeAdminBtn.setOnClickListener {

            val myIntent = Intent(this, ChangeAdminActivity::class.java)
            startActivity(myIntent)
        }
    }
}