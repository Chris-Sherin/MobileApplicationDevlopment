package com.example.colorclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val redbtnval =findViewById<TextView>(R.id.Red_Button)
        val bluebtnval = findViewById<TextView>(R.id.Blue_button)
        val greenbtnval=findViewById<TextView>(R.id.Green_button)
        val colorbtn=findViewById<TextView>(R.id.clickView)
         redbtnval.setOnClickListener{
             colorbtn.text="Red was clicked"
         }
        bluebtnval.setOnClickListener{
            colorbtn.text="Blue was clicked"
        }
        greenbtnval.setOnClickListener{
            colorbtn.text="Green was clicked"
        }

    }
}