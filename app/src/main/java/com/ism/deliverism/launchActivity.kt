package com.ism.deliverism

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

@SuppressLint("CustomSplashScreen")
class launchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        val lButton = findViewById<Button>(R.id.lButton)
        lButton.setOnClickListener {
            val intent = Intent(this@launchActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}