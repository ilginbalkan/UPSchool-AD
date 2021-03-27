package com.example.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate", "Çalıştı")

        toAfromMain.setOnClickListener {
            val intentA = Intent(this@MainActivity,sayfa_a::class.java)
            startActivity(intentA)
        }
        toXfromMain.setOnClickListener {
            val intentX = Intent(this@MainActivity,sayfa_x::class.java)
            startActivity(intentX)
        }
    }
    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}