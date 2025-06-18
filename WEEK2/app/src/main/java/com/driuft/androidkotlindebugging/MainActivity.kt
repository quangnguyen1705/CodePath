package com.driuft.androidkotlindebugging

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.driuft.androidkotlindebugging.ui.*
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {

    private val challengeOneButton: Button get() = findViewById(R.id.challenge_one)
    private val challengeTwoButton: Button get() = findViewById(R.id.challenge_two)
    private val challengeThreeButton: Button get() = findViewById(R.id.challenge_three)
    private val challengeFourButton: Button get() = findViewById(R.id.challenge_four)
    private val challengeFiveButton: Button get() = findViewById(R.id.challenge_five)
    private val challengeSixButton: Button get() = findViewById(R.id.challenge_six)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        challengeOneButton.setOnClickListener { launchHelloWorldActivity() }
        challengeTwoButton.setOnClickListener { launchNumSumActivity() }
        challengeThreeButton.setOnClickListener { launchCurrentDayActivity() }
        challengeFourButton.setOnClickListener { launchRandomColorActivity() }
        challengeFiveButton.setOnClickListener { launchPrintListActivity() }
        challengeSixButton.setOnClickListener { launchFavoriteNumberActivity() }
    }

    private fun launchHelloWorldActivity() {
        //challenge 0
        //val i = Intent(404 as Context, HelloWorldActivity::class.java)
        Log.v("Challenge 0", "Fix Bug Hello Word")
        val i = Intent(this, HelloWorldActivity::class.java)
        startActivity(i)
    }

    private fun launchNumSumActivity() {
        Log.v("Challenge 1", "Fix Bug Number Sum")
        val i = Intent(this, NumSumActivity::class.java)
        startActivity(i)
    }

    private fun launchCurrentDayActivity() {
        Log.v("Challenge 2", "Current Day")
        val i = Intent(this, CurrentDayActivity::class.java)
        startActivity(i)
    }

    private fun launchRandomColorActivity() {
        Log.v("Challenge 3", "RandomColor")
        val i = Intent(this, RandomColorActivity::class.java)
        startActivity(i)
    }

    private fun launchPrintListActivity() {
        Log.v("Challenge 4", "Print Lists")
        val i = Intent(this, PrintListActivity::class.java)
        startActivity(i)
    }

    private fun launchFavoriteNumberActivity() {
        Log.v("Challenge 5", "Favorite Number")
        val i = Intent(this, FavoriteNumber::class.java)
        startActivity(i)
    }
}