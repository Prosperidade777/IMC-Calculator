package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btncalcular = findViewById<Button>(R.id.btncalcular)

        btncalcular.setOnClickListener {
            val pesoStr: String = edtpeso.text.toString()
            val alturaStr:String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                Snackbar
                    .make(edtpeso, "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                )
                    .show()
            }


            else {

                val altura = alturaStr.toFloat()
                val peso = pesoStr.toFloat()



            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println(resultado)
        }
    }


 }
}