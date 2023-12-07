package com.example.listapaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapaises.databinding.ActivitySecondBinding
import com.example.listapaises.model.Pais

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var pais: Pais

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pais = intent.extras!!.getSerializable("pais") as Pais

        binding.nombrePais.text = pais.nombre
        binding.numeroHabitantes.text = pais.numHabitantes.toString()
    }
}