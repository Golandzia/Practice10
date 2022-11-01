package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        setTitle("LinearLayout")
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
    fun orientbutton1(view: View){
        val textOrient:TextView = findViewById(R.id.textView2)
        textOrient.text = "Вертикальная"
    }
    fun gravitybutton2(view: View){
        val textOrient:TextView = findViewById(R.id.textView4)
        textOrient.text = "Левая"
    }
    fun orientbutton3(view: View){
        val textOrient:TextView = findViewById(R.id.textView2)
        textOrient.text = "Горизональная"
    }
    fun gravitybutton4(view: View){
        val textOrient:TextView = findViewById(R.id.textView4)
        textOrient.text = "Центр"
    }
    fun orientbutton5(view: View) {
        val textOrient: TextView = findViewById(R.id.textView2)
        textOrient.text = "Вертикальная"
    }
    fun gravitybutton6(view: View){
        val textOrient:TextView = findViewById(R.id.textView4)
        textOrient.text = "Правая"
    }
}
