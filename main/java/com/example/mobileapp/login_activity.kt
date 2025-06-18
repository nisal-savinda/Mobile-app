package com.example.mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        var login = findViewById<Button>(R.id.btnlogin)

        login.setOnClickListener {
            var intent = Intent(this,home_activity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
