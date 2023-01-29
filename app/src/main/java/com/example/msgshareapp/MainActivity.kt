package com.example.msgshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnShowToast)
        button.setOnClickListener {
            // Do something in response to button click
            Log.i("MainActivity", "Button was clicked!")

            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
            }



        val button2 = findViewById<Button>(R.id.btnSendMsgToNextActivity)
        button2.setOnClickListener {
            // Do something in response to button click
            val userinput = findViewById<EditText>(R.id.etUserMessage).text.toString()
            Toast.makeText(this, userinput, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            }
        }
    }

