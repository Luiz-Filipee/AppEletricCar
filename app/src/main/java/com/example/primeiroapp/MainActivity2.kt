package com.example.primeiroapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity(){
    lateinit var preco : EditText
    lateinit var km_percorrido: EditText
    lateinit var btn_enviar: Button
    lateinit var radioGroup: RadioGroup
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var switch: Switch
    lateinit var resultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setuView()
        setupListernes()
    }

    fun setuView(){
        preco = findViewById(R.id.et_preco_kwh)
        km_percorrido = findViewById(R.id.et_km_percorrido)
        btn_enviar = findViewById(R.id.btn_enviar)
        resultado = findViewById(R.id.tv_resultado_calculado)
        radioGroup = findViewById(R.id.rg_comida_favorita)
        checkBox1 = findViewById(R.id.cb_1)
        checkBox2 = findViewById(R.id.cb_2)
        switch = findViewById(R.id.s_lampada)
    }

    fun setupListernes(){
        btn_enviar.setOnClickListener {
            calcular()
        }

    }

    private fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = km_percorrido.text.toString().toFloat()

        val result = km / preco

        resultado.text = result.toString()
    }
}