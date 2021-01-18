package com.example.introducaoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.result)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)

        btnChangeText.setOnClickListener {
            result.text = "Olá, Leonardo Boss"
        }
    }


}