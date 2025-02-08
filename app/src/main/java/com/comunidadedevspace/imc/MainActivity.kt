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
            val peso: String = edtpeso.text.toString()
            val altura:String = edtaltura.text.toString()

            if (peso == "" || altura == "") {
                Snackbar
                    .make(edtpeso, "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                )
                    .show()
            }

            else {

                val altura = altura.toFloat()
                val peso = peso.toFloat()



            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println(resultado)
        }
    }


 }
}