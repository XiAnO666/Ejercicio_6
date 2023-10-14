package com.example.ejercicio_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonToast = findViewById<Button>(R.id.button)

        botonToast.setOnClickListener{
            Toast.makeText(this, "El botón ha sido apretado", Toast.LENGTH_SHORT).show()
        }
    }
}