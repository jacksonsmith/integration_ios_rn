package net.natura.sellingcartlibrary

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView
import com.facebook.react.common.LifecycleState
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
import com.facebook.react.modules.core.PermissionAwareActivity
import com.facebook.react.modules.core.PermissionListener
import com.facebook.react.shell.MainReactPackage

class SellingCartLibraryActivity : AppCompatActivity(), DefaultHardwareBackBtnHandler, PermissionAwareActivity {

    private var reactInstanceManager: ReactInstanceManager? = null
    private var permissionListener: PermissionListener? = null

    // region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val initialProperties = Bundle().apply {
                putString("user", "<COLOCAR_COD_CONSULTORA_AQUI>")
            }

            val reactRootView = ReactRootView(this)

            reactInstanceManager = ReactInstanceManager.builder()
                    .setApplication(application)
                    .setCurrentActivity(this)
                    .setBundleAssetName("index.android.bundle")
                    .setJSMainModulePath("index")
                    .addPackage(MainReactPackage())
                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                    .setInitialLifecycleState(LifecycleState.RESUMED)
                    .build()

            reactRootView.startReactApplication(reactInstanceManager, "SellingCartApp", initialProperties)
            setContentView(reactRootView)

            lastInstance = this
        } catch (exception: Exception) {
            println("An error occurred while starting React Native: $exception")
        }
    }

    override fun onPause() {
        super.onPause()
        reactInstanceManager?.onHostPause(this)
    }

    override fun onResume() {
        super.onResume()
        reactInstanceManager?.onHostResume(this, this)
    }

    override fun onDestroy() {
        super.onDestroy()
        reactInstanceManager?.onHostDestroy(this)
    }
    // endregion

    // region Permissions
    @TargetApi(Build.VERSION_CODES.M)
    override fun requestPermissions(permissions: Array<String>?, requestCode: Int, listener: PermissionListener?) {
        permissions?.let {
            permissionListener = listener
            requestPermissions(it, requestCode)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        permissionListener?.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
    // endregion

    // region Key events
    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }

    override fun onBackPressed() {
        reactInstanceManager?.onBackPressed() ?: super.onBackPressed()
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        reactInstanceManager?.let {
            if (keyCode == KeyEvent.KEYCODE_MENU) {
                it.showDevOptionsDialog()
                return true
            }
        }

        return super.onKeyUp(keyCode, event)
    }
    // endregion

    companion object {
        private var lastInstance: SellingCartLibraryActivity? = null
    }
}
