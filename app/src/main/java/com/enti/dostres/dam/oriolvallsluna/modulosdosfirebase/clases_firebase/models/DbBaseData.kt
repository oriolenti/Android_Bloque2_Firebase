package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.models

interface DbBaseData {
    var id: String?

    fun getTable(): String
}