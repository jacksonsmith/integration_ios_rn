package net.natura.caderninho

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_caderninho.callReactButton

class CaderninhoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_caderninho)

        callReactButton.setOnClickListener {
            // TODO: call RN module
        }
    }
}
