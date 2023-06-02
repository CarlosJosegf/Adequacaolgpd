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
        val btnCapitulo02= findViewById<Button>(R.id.btnCapitulo02)
        btnCapitulo02.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo02::class.java)
            startActivity(Intent)
        }

        val btnCapitulo03= findViewById<Button>(R.id.btnCapitulo03)
        btnCapitulo03.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo03::class.java)
            startActivity(Intent)
        }

        val btnCapitulo04= findViewById<Button>(R.id.btnCapitulo04)
        btnCapitulo04.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo04::class.java)
            startActivity(Intent)
        }

        val btnCapitulo05= findViewById<Button>(R.id.btnCapitulo05)
        btnCapitulo05.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo05::class.java)
            startActivity(Intent)
        }
        val btnCapitulo06= findViewById<Button>(R.id.btnCapitulo06)
        btnCapitulo06.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo06::class.java)
            startActivity(Intent)
        }
        val btnCapitulo07= findViewById<Button>(R.id.btnCapitulo07)
        btnCapitulo07.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo07::class.java)
            startActivity(Intent)
        }
        val btnCapitulo08= findViewById<Button>(R.id.btnCapitulo08)
        btnCapitulo08.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo08::class.java)
            startActivity(Intent)
        }
        val btnCapitulo09= findViewById<Button>(R.id.btnCapitulo09)
        btnCapitulo09.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo09::class.java)
            startActivity(Intent)
        }
        val btnCapitulo10= findViewById<Button>(R.id.btnCapitulo10)
        btnCapitulo10.setOnClickListener {
            val Intent = Intent(this, MainActivityCapitulo10::class.java)
            startActivity(Intent)
        }


    }
}