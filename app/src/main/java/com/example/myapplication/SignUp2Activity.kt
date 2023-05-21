package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        val backBtn = findViewById<Button>(R.id.backBtn)
        val signupBtn = findViewById<Button>(R.id.signUpBtn)

        backBtn.setOnClickListener {
            finish()
        }
        signupBtn.setOnClickListener{
            //여기에 나중에 회원정보를 데이터베이스로 보내는 코드 작성해야함*********
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
        }

    }
}