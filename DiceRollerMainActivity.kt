package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

           rollDice()
            //  val toast = Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT)
            // toast.show();
        }
    }

    fun rollDice(){
        val resultTextView: TextView = findViewById(R.id.textView)
        val dice =Dice(6)

        resultTextView.text=dice.roll().toString()

    }
}

class Dice(val sides:Int){

    fun roll(): Int {

        return (1..sides).random()
    }
}