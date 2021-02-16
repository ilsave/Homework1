package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonWay2: Button
    private lateinit var buttonWay1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonWay2 = findViewById(R.id.button2)
        buttonWay1 = findViewById(R.id.button1)

        buttonWay2.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        buttonWay1.setOnClickListener {
            val intent = Intent(this, ActivityASecond::class.java)
            startActivity(intent)
        }

    }
}