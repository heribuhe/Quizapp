package com.administrador.quizapp

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
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
        boton1 = findViewById<Button>(R.id.boton1)

        boton1.setOnClickListener {
            val text = "True"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()


        }

        boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val text = "false"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
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