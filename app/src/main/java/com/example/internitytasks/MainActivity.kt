package com.example.internitytasks

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt1:TextView
    lateinit var txt2:TextView
    lateinit var txt3:TextView
    lateinit var txt4:TextView
    lateinit var txt5:TextView
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt1=findViewById(R.id.txt1)
        txt2=findViewById(R.id.txt2)
        txt3=findViewById(R.id.txt3)
        txt4=findViewById(R.id.txt4)
        txt5=findViewById(R.id.txt5)
        btn1=findViewById(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivityForResult(intent, 2)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == 2) {
                val name1 = data?.getStringExtra("NAME")
                txt1.setText(name1)
                val email1 = data?.getStringExtra("EMAIL ID")
                txt2.setText(email1)
                val college1 = data?.getStringExtra("COLLEGE NAME")
                txt3.setText(college1)
                val course1 = data?.getStringExtra("COURSE")
                txt4.setText(course1)
                val address1 = data?.getStringExtra("ADDRESS")
                txt5.setText(address1)
            }
        }
    }

