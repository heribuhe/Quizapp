package com.administrador.quizapp

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.time.Duration

class MainActivity : AppCompatActivity() {

    private val TAG = "Cycle app";

    lateinit var  boton1: Button;
    lateinit var boton2: Button;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val input1 = findViewById<EditText>(R.id.texto)
        val btnMostrar1 = findViewById<Button>(R.id.boton1)
        val btnMostrar2 = findViewById<Button>(R.id.boton2)


        btnMostrar1.setOnClickListener {
            val texto = input1.text.toString()

            if (texto.isEmpty()) {
                Toast.makeText(this, "Ingrese un texto", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
        }



        btnMostrar2.setOnClickListener {
            val texto = btnMostrar2.text.toString()
            if (texto.isEmpty()) {
                Toast.makeText(this, "Ingrese un texto", Toast.LENGTH_SHORT).show()
                }else{
                Toast.makeText(this, texto.reversed(), Toast.LENGTH_SHORT).show()
            }
        }







    }





    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onPause Called");


    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onPause Called");

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called");

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onPause Called");

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "on Called");

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called");


    }

}