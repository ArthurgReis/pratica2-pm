package com.example.pratica2_pdm

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.buttonClique)

        botao.setOnClickListener {
            Toast.makeText(this, "Bem-vindo ao meu App!", Toast.LENGTH_LONG).show()
        }
    }
}