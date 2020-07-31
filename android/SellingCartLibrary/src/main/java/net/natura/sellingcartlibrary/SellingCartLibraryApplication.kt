package net.natura.sellingcartlibrary

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class SellingCartLibraryApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
