package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.*

class CurrentDayActivity : AppCompatActivity() {

    private lateinit var currentDayText: TextView
    private val cal: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        Log.v("Challenge 2"," Run Current Day Activity")
        currentDayText = findViewById(R.id.current_day_text)
        //currentDayText.text = getString(getDayOfMonth())
        currentDayText.text = getDayOfMonth().toString()
    }

    private fun getDayOfMonth(): Int {
        return cal.get(Calendar.DAY_OF_MONTH)
    }
}