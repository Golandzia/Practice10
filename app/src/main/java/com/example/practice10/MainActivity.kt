package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1Click(viewOfButton1: View){
        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)
        button1.visibility = View.INVISIBLE
        button2.visibility = View.VISIBLE
    }
    fun button2Click(viewOfButton2: View){
        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)
        button1.visibility = View.VISIBLE
        button2.visibility = View.INVISIBLE
    }
}
