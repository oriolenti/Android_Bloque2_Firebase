import com.google.firebase.crashlytics.KeyValueBuilder
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import java.lang.Exception

class MyFirebaseCrashlytics {

    private val crashlytics = Firebase.crashlytics

    fun logSimpleError(text:String, addExtraDataFun: (KeyValueBuilder.() -> Unit)? = null) {
        logError(Exception(text), addExtraDataFun)
    }

    fun logError(exception: Exception, addExtraDataFun: (KeyValueBuilder.() -> Unit)? = null) {

        addExtraDataFun?.let { extraDataFun ->
            val builder = KeyValueBuilder(crashlytics)
            builder.extraDataFun()
        }
        crashlytics.recordException(exception)
    }
}