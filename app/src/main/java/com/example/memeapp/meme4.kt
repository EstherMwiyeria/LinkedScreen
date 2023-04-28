package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme4 : AppCompatActivity() {
    lateinit var button4: Button
    lateinit var button8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        button4=findViewById(R.id.button4)
        button8=findViewById(R.id.button8)
        button4.setOnClickListener {
            val forward = Intent(this, meme5::class.java)
            startActivity(forward)
        }
        button8.setOnClickListener {
            val forward = Intent(this, meme3::class.java)
            startActivity(forward)
        }
    }
}