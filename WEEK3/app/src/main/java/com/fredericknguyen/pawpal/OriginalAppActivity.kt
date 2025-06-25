package com.fredericknguyen.pawpal

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OriginalAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_original_app)
        // set up tooltips
        setupTooltips()
        //set up navigation to back main
        val buttonBack = findViewById<Button>(R.id.backButton)
        buttonBack.setOnClickListener { finish() }
    }

    private fun setupTooltips() {
        findViewById<ImageView>(R.id.petCareIcon).tooltipText = "Pet care services"
        findViewById<TextView>(R.id.serviceTitle).tooltipText = "Available pet care services"
        findViewById<Button>(R.id.bookServiceButton).tooltipText = "Book a pet care service"
        findViewById<Button>(R.id.emergencyButton).tooltipText = "Emergency vet contact"
    }

}