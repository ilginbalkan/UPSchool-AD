package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_a.*

class sayfa_a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a)

        toBfromA.setOnClickListener {
            val intent = Intent(this@sayfa_a, sayfa_b::class.java)
            startActivity(intent)
        }
    }
}