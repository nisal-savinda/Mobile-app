package com.example.mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var signup = findViewById<Button>(R.id.btnsignup)

        signup.setOnClickListener {
            var intent = Intent(this,home_activity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
