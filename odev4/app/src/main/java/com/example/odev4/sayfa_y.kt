package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sayfa_y : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y)
    }
    override fun onBackPressed() {
        val intent = Intent(this@sayfa_y, MainActivity::class.java)
        startActivity(intent)
    }
}