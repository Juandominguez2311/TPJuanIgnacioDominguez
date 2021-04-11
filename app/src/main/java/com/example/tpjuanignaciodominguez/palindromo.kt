package com.example.tpjuanignaciodominguez

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class palindromo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)

        val botonpaHome: Button = findViewById(R.id.b_home2)


        botonpaHome.setOnClickListener(View.OnClickListener {
            val intento: Intent = Intent(this, MainActivity::class.java)
            startActivity(intento)
        })
    }

    fun BotonInspeccionar(view: View) {
        val estado: TextView = findViewById(R.id.tv_palindromo);
        val frase: EditText = findViewById(R.id.et_palindromo);
        val CharFrase = frase.text.toString().toCharArray()
        val intLength = CharFrase.size


        for (i in 0 until intLength / 2) {
            if (CharFrase[i] != CharFrase[intLength - 1 - i]) {
                false
                estado.text = "No es Palindromo"
                break
            }
            else{
                estado.text = "Es Palindromo"
            }
        }


    }
}

