package com.example.adequacaolgpd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityResolucoesAnpd : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resolucoes_anpd)

        supportActionBar?.hide()

        val btnResolucao02 = findViewById<Button>(R.id.btnResolucao02)
        btnResolucao02.setOnClickListener {
            val Intent = Intent(this, MainActivityResolucao02::class.java)
            startActivity(Intent)
        }
    }
}