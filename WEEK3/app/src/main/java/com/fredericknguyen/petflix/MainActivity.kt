package com.fredericknguyen.petflix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val loginButton: Button get() = findViewById(R.id.loginButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener{launchLoginActivityPersonal()}
    }
    private fun launchLoginActivityPersonal() {

        val i = Intent(this, ActivityPersonal::class.java)
        startActivity(i)
    }
}