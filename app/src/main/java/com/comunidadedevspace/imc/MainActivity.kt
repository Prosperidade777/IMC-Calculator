package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btncalcular = findViewById<Button>(R.id.btncalcular)

        btncalcular.setOnClickListener {
            val pesoStr = edtpeso.text.toString()
            val alturaStr = edtaltura.text.toString()

            if (pesoStr.isBlank() || alturaStr.isBlank()) {
                Snackbar.make(edtpeso, "Preencha todos os campos", Snackbar.LENGTH_LONG).show()
            } else {
                val altura = alturaStr.toFloat()
                val peso = pesoStr.toFloat()

                val resultado = calcularIMC(peso, altura)

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)
            }
        }
    }

    private fun calcularIMC(peso: Float, altura: Float): Float {
        return peso / (altura * altura)
    }
}

