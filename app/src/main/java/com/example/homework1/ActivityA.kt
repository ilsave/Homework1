package com.example.homework1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class ActivityA : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var buttonActivityA:  Button
    private var actionfromActivityA = "ToActivityB"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
     //   Toast.makeText(applicationContext, "A activity", Toast.LENGTH_SHORT).show()
        button = findViewById(R.id.button)
        buttonActivityA = findViewById(R.id.button5)
        button.setOnClickListener {
//            val intent = Intent(this, ActivityB::class.java)
//            startActivity(intent)
           // Toast.makeText(this, "you pressed", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MyReceiver::class.java)
            intent.action = actionfromActivityA
            sendBroadcast(intent)
        }

        buttonActivityA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        Log.d("Activity", "This is Activity A $this")

    }
}