package com.example.listapaises

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.listapaises.data.DataSet
import com.example.listapaises.databinding.ActivityMainBinding
import com.example.listapaises.model.Pais

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adaptadorLista: ArrayAdapter<Pais>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.paisSeleccionado.text = ""
        binding.paisSeleccionado.text = savedInstanceState?.getString("pais") ?:""
        adaptadorLista = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,
            DataSet.getAllPaises())

        binding.listViewPaises.adapter = adaptadorLista

        binding.listViewPaises.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("pais",DataSet.getAllPaises()[position])
            startActivity(intent)
        }

        binding.listViewPaises.setOnItemLongClickListener { parent, view, position, id ->
            binding.paisSeleccionado.text = DataSet.getAllPaises()[position].toString()
            return@setOnItemLongClickListener true
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)//
        outState.putString("pais", binding.paisSeleccionado.text.toString())
    }
}