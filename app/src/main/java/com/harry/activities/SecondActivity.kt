package com.harry.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harry.models.Constants
import com.harry.R
import com.harry.showToast
import kotlinx.android.synthetic.main.activity_b.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY).toString()
            showToast(msg)
            txvUserMessage.text = msg

        }

    }
}
