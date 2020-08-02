package com.sellingcartapp

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastModule(
        private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule() {

    override fun getName(): String = "ToastModule"

    override fun getConstants(): MutableMap<String, Any> = mutableMapOf(
            SHORT_KEY to Toast.LENGTH_SHORT,
            LONG_KEY to Toast.LENGTH_LONG
    )

    @ReactMethod
    fun show(text: String, duration: Int) {
        Toast.makeText(reactContext, text, duration).show()
    }

    companion object {
        const val SHORT_KEY = "SHORT"
        const val LONG_KEY = "LONG"
    }
}
