package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.models

import java.util.Date

data class DBUser(
    override var id: String? = null,
    var email: String? = null,
    var username: String? = null,
    var photoPath: String? = null,
    var lastLogin: Date? = Date(),
    val isAdmin: Boolean = false
) : DbBaseData {
    override fun getTable() = "Users"
}