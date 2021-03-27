package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_x.*

class sayfa_x : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_x)

        toYfromX.setOnClickListener {
            val intent = Intent(this@sayfa_x, sayfa_y::class.java)
            startActivity(intent)
        }
    }
}