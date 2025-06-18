package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.Random

class FavoriteNumber : AppCompatActivity() {

    private val favoriteNumber: TextView get() = findViewById(R.id.favorite_number)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)
        Log.v("Challenge 5", "Run Favorite Number Activity")
        //val number: Int? = null
        val number: Int = 42
        val rnd = Random()
        favoriteNumber.text = rnd.nextInt(number).toString()
        Log.v("Challenge 5", rnd.nextInt(number).toString())
    }
}