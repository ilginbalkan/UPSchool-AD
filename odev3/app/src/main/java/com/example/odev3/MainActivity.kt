package com.example.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = (0..100).random()
        var hak = 100

        submitButton.setOnClickListener {

            val guess = inputBox.text.toString()
            hak = hak - 1

            if(guess.isNullOrEmpty()){
                Toast.makeText(this@MainActivity, "Bir Sayı Giriniz", Toast.LENGTH_SHORT).show()
            }
            else{
                if(hak == 0){
                    infoText.text = "Hakkınız kalmadı"
                    scoreText.text = "Skorunuz: ${hak}"
                }
                else{
                    if (guess.toInt() < random){
                        infoText.text = "Daha Büyük Bir Sayı Dene"
                        scoreText.text = "Skorunuz: ${hak}"
                    }
                    else if (guess.toInt() > random){
                        infoText.text = "Daha Küçük Bir Sayı Dene"
                        scoreText.text = "Skorunuz: ${hak}"
                    }
                    else{
                        infoText.text = "Tebrikler Bildiniz Skorunuz: ${hak}"
                        scoreText.text = ""
                        inputBox.isEnabled = false
                    }
                }
            }


        }
    }
}