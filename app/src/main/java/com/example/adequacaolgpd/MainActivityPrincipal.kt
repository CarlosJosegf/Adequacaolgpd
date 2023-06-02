package com.example.adequacaolgpd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivityPrincipal : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_principal)

        supportActionBar?.hide()

        val btLgpd = findViewById<Button>(R.id.btnLgpd)
        btLgpd.setOnClickListener {
            val Intent = Intent(this, MainActivityLgpd::class.java)
            startActivity(Intent)
        }
    }
}