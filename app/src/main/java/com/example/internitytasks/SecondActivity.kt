package com.example.internitytasks

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var et3: EditText
    lateinit var et4: EditText
    lateinit var et5: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        et3 = findViewById(R.id.et3)
        et4 = findViewById(R.id.et4)
        et5 = findViewById(R.id.et5)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            val name = et1.text.toString()
            intent.putExtra("NAME", name)
            val email = et2.text.toString()
            intent.putExtra("EMAIL ID", email)
            val college = et3.text.toString()
            intent.putExtra("COLLEGE NAME", college)
            val course = et4.text.toString()
            intent.putExtra("COURSE", course)
            val address = et5.text.toString()
            intent.putExtra("ADDRESS", address)
            setResult(2, intent)
            finish()
        }
    }
}