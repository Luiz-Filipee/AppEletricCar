package com.example.primeiroapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    lateinit var preco : EditText
    lateinit var km_percorrido: EditText
    lateinit var btn_enviar: Button
    lateinit var radioGroup: RadioGroup
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var switch: Switch
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
        radioGroup = findViewById(R.id.rg_comida_favorita)
        checkBox1 = findViewById(R.id.cb_1)
        checkBox2 = findViewById(R.id.cb_2)
        switch = findViewById(R.id.s_lampada)
    }

    fun setupListernes(){
        btn_enviar.setOnClickListener {
            val textoDigitado = preco.text.toString()
            Log.d("Texto digitado" ,textoDigitado)

            if(!checkBox1.isChecked && !checkBox2.isChecked){
                Log.d("selecione um checkbox", "1 ou 2")
            }

            if(checkBox1.isChecked){
                Log.d("compromisso", "1 feito")
            }else{
                Log.d("compromisso", "2 nao feito feito")

            }

            if(checkBox2.isChecked){
                Log.d("compromisso", "2 feito")
            }else{
                Log.d("compromisso", "1 nao feito feito")

            }

            if(checkBox1.isChecked && checkBox2.isChecked){
                Log.d("compromisso", "1 e 2 feito")
            }else{
                Log.d("compromisso", "1 e 2 nao feito")

            }
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId: Int ->
            val radio = findViewById<RadioButton>(checkedId)
            Log.d("Opção selecionada ->", radio.text.toString())
        }

        switch.setOnCheckedChangeListener { _, isChecked: Boolean ->
            if(isChecked){
                Log.d("Interruptor ->", "Ligado $isChecked")
            }else{
                Log.d("Interruptor ->", "Desligado $isChecked")
            }
        }
    }

}