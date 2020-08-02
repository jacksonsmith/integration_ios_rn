package com.sellingcartapp

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ToastModule(
        private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule() {

    override fun getName(): String = "ToastModule"

    @ReactMethod
    fun show(text: String) {
        Toast.makeText(reactContext, text, Toast.LENGTH_LONG).show()
    }
}
