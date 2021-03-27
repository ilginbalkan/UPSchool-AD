package com.example.odev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceButton : Button = findViewById(R.id.rollButton)
        val cleanButton : Button = findViewById(R.id.cleanButton)

        val dice1 = Dice(findViewById(R.id.number1), findViewById(R.id.dice1))
        val dice2 = Dice(findViewById(R.id.number2), findViewById(R.id.dice2))

        diceButton.setOnClickListener {
            dice1.roll()
            dice2.roll()
            Toast.makeText(this@MainActivity, "Zar Atıldı", Toast.LENGTH_SHORT).show()
        }
        cleanButton.setOnClickListener {
            dice1.clean()
            dice2.clean()
            Toast.makeText(this@MainActivity, "Silindi", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dice(var number : TextView, var diceImage : ImageView){

    fun roll(){
        val random = (1..6).random()
        number.text = random.toString()
        when (random){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
    fun clean(){
        number.text = ""
        diceImage.setImageResource(R.drawable.empty_dice)
    }
}