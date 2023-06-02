package com.example.adequacaolgpd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityLgpd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lgpd)

        supportActionBar?.hide()

        val btnCapitulo01= findViewById<Button>(R.id.btnCapitulo01)
        btnCapitulo01.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo01::class.java)
            startActivity(Intent)
        }
    }
}