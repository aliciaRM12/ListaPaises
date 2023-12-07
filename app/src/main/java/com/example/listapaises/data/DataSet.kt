package com.example.listapaises.data

import com.example.listapaises.model.Pais

class DataSet {

    companion object{

        fun getAllPaises(): ArrayList<Pais>{

            val listaPaises = ArrayList<Pais>()
            listaPaises.add(Pais("España",48446594))
            listaPaises.add(Pais("Polonia",36753736))
            listaPaises.add(Pais("Italia",58850717))
            listaPaises.add(Pais("Francia",68521974))
            listaPaises.add(Pais("Colombia",51609000))
            listaPaises.add(Pais("Portugal",10467366))
            listaPaises.add(Pais("Ecuador",17510643))
            listaPaises.add(Pais("Suiza",8812728))
            listaPaises.add(Pais("Grecia",10394055))
            listaPaises.add(Pais("Peru",33726000))
            return listaPaises
        }

    }
}