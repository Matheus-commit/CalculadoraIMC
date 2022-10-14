package br.com.cotemig.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var altura_user = findViewById<EditText>(R.id.altura)
        var peso_user = findViewById<EditText>(R.id.peso)
        var resultado = findViewById<TextView>(R.id.resultado)
        var btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener{

            var alt = altura_user.text.toString().toDouble()
            var pes = peso_user.text.toString().toDouble()

            //massa/altura²

            var resul : Double = pes/(alt * alt)

            var d = (String.format("%.2f", resul))
            resultado.text = d.format(resul)

        }
    }



}