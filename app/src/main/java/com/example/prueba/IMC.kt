package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_imc.*
import kotlinx.android.synthetic.main.activity_main.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        bCalcularIMC.setOnClickListener{
            try {
                //recolectar variables del formulario
                var Peso:String=etPeso.text.toString()
                var peso: Float =Peso.toFloat() //convirtiendo a Float
                var Altura:String=etAltura.text.toString()
                var altura: Float =Altura.toFloat() //convirtiendo a Float
                var Occipu:String=etOccipu.text.toString()
                var occipu: Float =Occipu.toFloat() //convirtiendo a Float
                var nombre:String=etNombre.text.toString()
                var raza:String=etNombre.text.toString()


                val saltar:Intent=Intent(this, ResultIMC::class.java)
                //envío de variables
                saltar.putExtra("peso",peso)
                saltar.putExtra("altura",altura)
                saltar.putExtra("occipu",occipu)
                saltar.putExtra("nombre",nombre)
                saltar.putExtra("raza",raza)
                startActivity(saltar)
            } catch (e: NumberFormatException) {
                var nombre="Sin nombre"
                var edad = 0
                Toast.makeText(applicationContext, "LLene el formulario por completo",
                    Toast.LENGTH_SHORT).show()
            }

        }


    }
}