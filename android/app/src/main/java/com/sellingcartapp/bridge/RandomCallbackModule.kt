package com.sellingcartapp.bridge

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.random.Random

class RandomCallbackModule(
        private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule() {

    override fun getName(): String = "RandomCallbackModule"

    @ReactMethod
    fun request(
            successListener: Callback,
            errorListener: Callback
    ) {
        if (Random.nextBoolean()) {
            successListener.invoke("Successful call")
        } else {
            errorListener.invoke("Error in request")
        }
    }
}
