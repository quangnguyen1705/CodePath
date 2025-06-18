package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class PrintListActivity : AppCompatActivity() {

    private val wordList: TextView get() = findViewById(R.id.word_list)
    private var words = listOf(
        "this",
        "is",
        "your",
        "standard",
        "immutable",
        "list"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_list)
        Log.v("Challenge 4", "Run Print Lists Activity")
        wordList.text = combinedWords()
    }

    private fun combinedWords(): String {
        var combined = ""
//        for (idx in 0 until words.size + 1) {
//            combined += "${words[idx]}\n"
//        }
        for (word in words){
            combined += "${word}\n"
        }
        return combined
    }
}