package com.example.homework1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class ActivityBSecond : AppCompatActivity() {

    private lateinit var edActivityB: EditText

    val broadCastReceiver = object : BroadcastReceiver() {
        override fun onReceive(contxt: Context?, intent: Intent?) {
            when (intent?.action) {
                "ToActivityB" -> Toast.makeText(this@ActivityBSecond, "I dont know what is going on here", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_second)

        edActivityB = findViewById(R.id.editTextActivityB)

        edActivityB.addTextChangedListener {
            if (edActivityB.text.toString() == "Activity C"){
                val intent = Intent(this, ActivityCSecond::class.java)
                startActivity(intent)
            }
        }

        Log.d("Activity", "This is Activity B $this")

    }
}