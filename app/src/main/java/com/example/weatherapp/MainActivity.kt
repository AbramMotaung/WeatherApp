package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ExitButton = findViewById<Button>(R.id.ExitButton)
        val goToSecondScreenButton = findViewById<Button>(R.id.button)
        goToSecondScreenButton.setOnClickListener {
            val intent = Intent(this, WeeklyWeather::class.java)
            // start you next activity
            startActivity(intent)

        }
    }
}