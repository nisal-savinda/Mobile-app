package com.example.mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<TextView>(R.id.txtlogin)

        login.setOnClickListener {
            var intent = Intent(this,login_activity::class.java)
            startActivity(intent)
            finish()
        }

        var signup = findViewById<TextView>(R.id.txtsignup)

        signup.setOnClickListener {
            var intent = Intent(this,activity_signup::class.java)
            startActivity(intent)
            finish()
        }
    }
}
