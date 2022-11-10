package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bimc.setOnClickListener{
            val saltar: Intent =Intent(this, IMC::class.java)
            startActivity(saltar)
        }

        bgrasaM.setOnClickListener{
            val saltar: Intent =Intent(this, IMC::class.java)
            startActivity(saltar)
        }

        bgrasaH.setOnClickListener{
            val saltar: Intent =Intent(this, IMC::class.java)
            startActivity(saltar)
        }

    }
}