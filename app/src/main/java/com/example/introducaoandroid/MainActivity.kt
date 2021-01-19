package com.example.introducaoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val valName = "valName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.resultName)
        val inputName = findViewById<EditText>(R.id.inputName)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnGotoResult = findViewById<Button>(R.id.btnGoToResult)

        btnChangeText.setOnClickListener {
            if (inputName.text.isNotBlank()) {
                result.text = getString(R.string.resultName, inputName.text.toString())
            } else {
                inputName.error = getString(R.string.error_input_name)
            }
        }

        btnGotoResult.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra(valName, inputName.text.toString())

            startActivity(intent)
        }
    }


}