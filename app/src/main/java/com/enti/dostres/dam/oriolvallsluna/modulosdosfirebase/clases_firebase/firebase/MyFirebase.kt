import android.app.Application
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.MyFirebaseAuth
import com.enti.dostres.dam.oriolvallsluna.modulosdosfirebase.clases_firebase.firebase.MyFirebaseDataBase

typealias FB = MyFirebase

class MyFirebase {
    companion object {

        lateinit var analytics : MyFirebaseAnalytics
        val crashlytics = MyFirebaseCrashlytics()

        lateinit var auth : MyFirebaseAuth

        val db = MyFirebaseDataBase()

        fun init(appContext : Application) {
            analytics = MyFirebaseAnalytics(appContext)
            auth = MyFirebaseAuth(appContext)
        }
    }
}