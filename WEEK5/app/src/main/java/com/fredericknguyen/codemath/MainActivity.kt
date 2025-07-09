package com.fredericknguyen.codemath

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.fredericknguyen.codemath.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val spinnerItems = (1..20).map { it.toString() }

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems)
        binding.spinnerPartySize.adapter = adapter

        binding.seekBarTip.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                binding.tvPercentLabel.text = "$progress%"
                updateTipAndTotal()
                binding.tvTipDescription.text = when {
                    progress < 10 -> "Poor"
                    progress < 15 -> "Okay"
                    progress < 20 -> "Good"
                    progress < 25 -> "Great"
                    else -> "Amazing"
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        binding.etBaseAmount.setOnEditorActionListener { _, _, _ ->
            updateTipAndTotal()
            true
        }

        binding.spinnerPartySize.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
                updateTipAndTotal()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun updateTipAndTotal() {
        val base = binding.etBaseAmount.text.toString().toDoubleOrNull() ?: return
        val tipPercent = binding.seekBarTip.progress
        val partySize = binding.spinnerPartySize.selectedItem.toString().toInt()

        val tip = base * tipPercent / 100
        val total = base + tip
        val totalPerPerson = total / partySize

        binding.tvTipAmount.text = "$%.2f".format(tip)
        binding.tvTotalAmount.text = "$%.2f".format(totalPerPerson)
    }

}