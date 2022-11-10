package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_imc.*

class ResultIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)


        val extras = intent.extras
        var nombre = extras?.getString("nombre")?:"sin nombre"
        var peso = extras?.getFloat("peso")?:-1
        var altura = extras?.getFloat("altura")?:-1
        var occipu = extras?.getFloat("occipu")?:-1
        var raza = extras?.getString("raza")?:"sin raza"

        val imc  = 12.2

        etNombreCan.setText("El IMC de " + nombre + " es:")
        etPesoCan.setText(" "+ imc  + " ")
        if (raza == "mini toy"){
            if(imc >= 1 && imc <= 6){
                textView5.setText("Peso Normal")
            }else if(imc < 1){
                textView5.setText("Bajo Peso")
            }else{
                textView5.setText("Sobre peso")
            }
        }
        if (raza == "pequeñas"){
            if(imc >= 7 && imc <= 15){
                textView5.setText("Peso Normal")
            }else if(imc < 7){
                textView5.setText("Bajo Peso")
            }else{
                textView5.setText("Sobre peso")
            }
        }

        if (raza == "medianas"){
            if(imc >= 14 && imc <= 27){
                textView5.setText("Peso Normal")
            }else if(imc < 14){
                textView5.setText("Bajo Peso")
            }else{
                textView5.setText("Sobre peso")
            }
        }

        if (raza == "grandes"){
            if(imc >= 25 && imc <= 39){
                textView5.setText("Peso Normal")
            }else if(imc < 25){
                textView5.setText("Bajo Peso")
            }else{
                textView5.setText("Sobre peso")
            }
        }

        if (raza == "gigante"){
            if(imc >= 34 && imc <= 82){
                textView5.setText("Peso Normal")
            }else if(imc < 34){
                textView5.setText("Bajo Peso")
            }else{
                textView5.setText("Sobre peso")
            }
        }

    }
}