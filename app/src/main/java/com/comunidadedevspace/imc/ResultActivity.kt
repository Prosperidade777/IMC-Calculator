package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        val tvClassificacao1 = findViewById<TextView>(R.id.tv_classificacao1)

        val classification: String = when {
            result <= 18.5f -> "Underweight"
            result <= 24.9f -> "Healthy Weight"
            result <= 29.9f -> "Overweight"
            result <= 39.9f -> "Obesity"
            else -> "Severe Obesity"
        }



        tvClassificacao.text = classification
        tvResult.text = result.toString()


    }
}