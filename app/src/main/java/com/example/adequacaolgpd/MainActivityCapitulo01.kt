package com.example.adequacaolgpd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivityCapitulo01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_capitulo01)

        supportActionBar?.hide()
    }
}