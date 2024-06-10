package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import java.util.Arrays


class WeeklyWeather : AppCompatActivity() {

    private val Days = arrayOf<String>(
    "Monday [22]",
    "Tuesday [21] Sunny",
    "Wednesday [17] Sunny",
    "Thursday [22] Sunny",
    "Friday [21] Sunny",
    "Saturday [16] Cold",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weekly_weather)
        val goToSecondScreenButton = findViewById<Button>(R.id.Next)
        goToSecondScreenButton.setOnClickListener {
            val intent = Intent(this, DetailView::class.java)
            // start you next activity
            startActivity(intent)


            findViewById<TextView>(R.id.DaysTextView)
          .text = Arrays.toString(Days)
        }
    }
}


