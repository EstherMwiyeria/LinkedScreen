package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme5 : AppCompatActivity() {
    lateinit var button5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {
            val forward = Intent(this, meme4::class.java)
            startActivity(forward)
        }
    }
}