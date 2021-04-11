package com.example.tpjuanignaciodominguez

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonTemperatura: Button = findViewById(R.id.b_temp)
        val botonpalindromo: Button = findViewById(R.id.b_palindromo)

        botonTemperatura.setOnClickListener(View.OnClickListener {
            val intento : Intent = Intent(this,Temperatura::class.java)
            startActivity(intento)


        })
        botonpalindromo.setOnClickListener(View.OnClickListener {
            val intento : Intent = Intent(this,palindromo::class.java)
            startActivity(intento)
        })
    }
}