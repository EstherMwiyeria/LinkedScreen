package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme2 : AppCompatActivity() {
    lateinit var button2: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        button2=findViewById(R.id.button2)
        button6=findViewById(R.id.button6)
        button2.setOnClickListener {
            val forward = Intent(this, meme3::class.java)
            startActivity(forward)
        }
        button6.setOnClickListener {
            val forward = Intent(this, MainActivity::class.java)
            startActivity(forward)
        }
    }
}