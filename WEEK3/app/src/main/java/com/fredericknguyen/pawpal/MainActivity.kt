package com.fredericknguyen.pawpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //set up tooltips for views
        setupTooltips()

        //set up navigation to original app
        val originalButton = findViewById<Button>(R.id.originalAppButton)
        originalButton.setOnClickListener {
            val intent = Intent(this,OriginalAppActivity::class.java)
            startActivity(intent)
        }

    }

    private fun setupTooltips() {
        findViewById<ImageView>(R.id.profileImage).tooltipText = "Your puppy profile picture"
        findViewById<TextView>(R.id.welcomeText).tooltipText = "Welcome message for new users"
        findViewById<Button>(R.id.findFriendsButton).tooltipText = "Find other puppies nearby"
        findViewById<Button>(R.id.playdateButton).tooltipText = "Schedule a playdate"
        findViewById<Button>(R.id.originalAppButton).tooltipText = "View original app design"
    }

}