package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import java.util.concurrent.RunnableScheduledFuture

class ActivityCSecond : AppCompatActivity() {

    private lateinit var edActivityC: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_second)


        edActivityC = findViewById(R.id.editTextActivityC)

        edActivityC.addTextChangedListener {
            if (edActivityC.text.toString() == "Activity C"){
                val intent = Intent(this, ActivityCSecond::class.java)
                startActivity(intent)
            }
        }

        Log.d("Activity", "This is Activity C $this")

    }
}