package com.example.unitconverterkg_pounds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputKgValue = findViewById<EditText>(R.id.edit_kg)
        val lbsValue = findViewById<TextView>(R.id.res_lbs)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val kg = inputKgValue.text.toString().toFloat()
            val lbs = kg * 2.2046
            lbsValue.setText(lbs.toString())
        }
    }
}