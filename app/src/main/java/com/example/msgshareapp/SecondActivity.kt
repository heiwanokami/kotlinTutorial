package com.example.msgshareapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras as Bundle
        val msg = bundle!!.getString("user_message")
        val usermessage = findViewById<TextView>(R.id.txvUserMessage)

        usermessage.text = msg
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}