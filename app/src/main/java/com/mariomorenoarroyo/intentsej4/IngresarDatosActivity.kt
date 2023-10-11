package com.mariomorenoarroyo.intentsej4

import android.app.Activity
import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class IngresarDatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos)

        val botonConfirmar = findViewById<Button>(R.id.Confirmar)
        botonConfirmar.setOnClickListener {
            val nombre = findViewById<EditText>(R.id.Nombre).text.toString()
            val hora = findViewById<EditText>(R.id.Hora).text.toString()
            val minutos = findViewById<EditText>(R.id.Minutos).text.toString()


            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, nombre)
                putExtra(AlarmClock.EXTRA_HOUR, hora)
                putExtra(AlarmClock.EXTRA_MINUTES, minutos)
            }
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }

