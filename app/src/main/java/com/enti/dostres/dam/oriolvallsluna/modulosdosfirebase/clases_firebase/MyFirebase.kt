package com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase

import android.app.Application

typealias FB = MyFirebase

class MyFirebase {
    companion object {

        //lateinit var analytics : MyFirebaseAnalytics
        //val crashlytics = MyFirebaseCrashlytics()

        lateinit var auth : MyFirebaseAuth

        fun init(appContext : Application) {
            //analytics = MyFirebaseAnalytics(appContext)
            auth = MyFirebaseAuth(appContext)
        }
    }
}