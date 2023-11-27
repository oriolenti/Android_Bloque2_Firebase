package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase

import android.app.Application
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MyFirebaseAuth(val appContext: Application) {

    private val  firebaseAuth = FirebaseAuth.getInstance()

    fun getUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }
}