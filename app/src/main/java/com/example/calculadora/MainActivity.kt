package com.example.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.ResourceCursorAdapter
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity() : AppCompatActivity() {
    val SUMA= "+"
    val RESTA= "-"
    val MULTIPLICACION= "*"
    val DIVISION= "/"
    val PORCENTAJE= "%"

    var operacionActual = ""

    var primerNumero:Double = Double.NaN
    var segundoNumero:Double = Double.NaN

    lateinit var TvTemp:TextView
    lateinit var Resultado:TextView

    lateinit var formatoDecimal:DecimalFormat


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        formatoDecimal = DecimalFormat("#.##########")
        TvTemp = findViewById(R.id.TvTemp)
        Resultado = findViewById(R.id.Resultado)
    }

    fun cambiarOperador(b:View){
        val boton:Button = b as Button
        if(boton.text.toString().trim()="÷") {
            operacionActual = "/"
        }else if(boton.text.toString().trim()="X"){
        }else{
            operacionActual = boton.text.toString().trim()
        }

    }

}