package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3 : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var button7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button3=findViewById(R.id.button3)
        button7=findViewById(R.id.button7)
        button3.setOnClickListener {
            val forward = Intent(this, meme4::class.java)
            startActivity(forward)
        }
        button7.setOnClickListener {
            val forward = Intent(this, meme2::class.java)
            startActivity(forward)
        }
    }
}