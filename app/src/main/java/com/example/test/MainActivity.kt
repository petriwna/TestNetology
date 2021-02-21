package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d("netology voice", "start of onCreate function")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText = "Hello world!"
        val myNumber = 42
        val myFloatingNumber = 14.2
        val outputText = myText + " " + myNumber + " " + myFloatingNumber

        val txtView = findViewById<TextView>(R.id.text_output)
        txtView.text = outputText

        Log.d("netology voice", "end of onCreate function")
    }
}