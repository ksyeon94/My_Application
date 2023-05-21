package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        nextBtn.setOnClickListener {
            val nextIntent = Intent(this, SignUp2Activity::class.java)
            startActivity(nextIntent)}
    }
}