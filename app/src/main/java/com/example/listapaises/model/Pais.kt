package com.example.listapaises.model

import java.io.Serializable

class Pais (val nombre: String, val numHabitantes: Int) : Serializable {

    override fun toString(): String {
        return nombre
    }
}