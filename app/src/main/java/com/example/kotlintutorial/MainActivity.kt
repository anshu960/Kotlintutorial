package com.example.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        var count = 0
       // btn.text= "Hello Anshu"
        txt.text = 0.toString()
        btn.setOnClickListener {
            btn.text = "Good Morning"
            count += 1
            txt.text = count.toString()
        }
    }
}