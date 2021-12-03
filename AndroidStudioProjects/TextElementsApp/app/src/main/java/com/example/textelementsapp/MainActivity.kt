package com.example.textelementsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var countClick= mutableMapOf<String,Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countClickView =findViewById<TextView>(R.id.clickCountView)
        val countButtonVal=findViewById<TextView>(R.id.clickButton)
        val nameviewval=findViewById<TextInputLayout>(R.id.NameView)
        countButtonVal.setOnClickListener{
            val userName=nameviewval.editText?.text?.toString()
            val userNameMask =
                if(userName.isNullOrEmpty()) "Somebody"

            else userName
           val oldClick = countClick[userNameMask]?:0
            val newClick =oldClick+1
                countClick[userNameMask]=newClick
                countClickView.text="$userNameMask clicked $newClick times"
        }
    }
}