package com.example.homework1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action){
            "ToActivityB" -> {Toast.makeText(context, "Hello there", Toast.LENGTH_SHORT).show()
                context.startActivity(Intent(context, ActivityB::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            }
            else ->         Toast.makeText(context, "coudnt find ", Toast.LENGTH_SHORT).show()

        }
    }
}