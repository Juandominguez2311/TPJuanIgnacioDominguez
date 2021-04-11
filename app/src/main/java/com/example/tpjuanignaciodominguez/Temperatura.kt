package com.example.tpjuanignaciodominguez

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Temperatura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperatura)

        //enlazo
        val Celsius : EditText =findViewById(R.id.et_Celsius)
        val Farenheit : TextView = findViewById(R.id.tv_Farenheit)
        val botonpaHome: Button = findViewById(R.id.b_home)


        botonpaHome.setOnClickListener(View.OnClickListener {
            val intento : Intent = Intent(this,MainActivity::class.java)
            startActivity(intento)
        })

        Celsius.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(Celsius.length() > 0){
                    Farenheit.text = (Celsius.text.toString().toDouble()*9/5+32).toString()
            }
            }
        })
        }
    }



