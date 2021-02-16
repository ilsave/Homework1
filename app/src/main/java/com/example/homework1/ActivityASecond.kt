package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class ActivityASecond : AppCompatActivity() {

    private lateinit var edEnterACtivity: EditText
    private var actionfromActivityA = "ToActivityB"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_second)

        edEnterACtivity = findViewById(R.id.editTextActivityA)

        edEnterACtivity.addTextChangedListener {
            if (edEnterACtivity.text.toString() == "Activity B"){
//                val intent = Intent(this, ActivityBSecond::class.java)
//                startActivity(intent)
                Toast.makeText(this, "hey there", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MyReceiver::class.java)
                intent.action = actionfromActivityA
                sendBroadcast(intent)
            }
        }

        Log.d("ActivityA", "This is Activity A $this")

    }
}