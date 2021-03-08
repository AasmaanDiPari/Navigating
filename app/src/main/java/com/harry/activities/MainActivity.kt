package com.harry.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.harry.models.Constants
import com.harry.R
import com.harry.showToast
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button is clicked!")
            showToast("Button is clicked")
        }
        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = eUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }
        btnSendDataToApps.setOnClickListener {
            val message: String = eUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to: "))
        }
        btnRecyclerDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
