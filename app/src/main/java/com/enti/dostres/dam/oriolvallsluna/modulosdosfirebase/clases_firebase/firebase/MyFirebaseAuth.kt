package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.firebase

import android.app.Application
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.models.DBUser
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MyFirebaseAuth (val appContext: Application) {
    private val firebaseAuth = FirebaseAuth.getInstance()
    private var currentUser: DBUser? = null

    fun getUser() = currentUser

    fun setCurrentUser(newUser: DBUser) {
        currentUser = newUser
    }

    fun getAuthDbUser() : DBUser? {
        firebaseAuth.currentUser?.let { user ->
            val dbUser = DBUser (
                id = user.uid,
                email = user.email,
                username = user.displayName,
                photoPath = user.photoUrl.toString()
            )
            return dbUser
        }
        return null
    }
}