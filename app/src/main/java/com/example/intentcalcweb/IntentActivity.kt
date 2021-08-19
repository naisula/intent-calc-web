package com.example.intentcalcweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        btn_sms.setOnClickListener {
            sendSMS("0722222445","Hello")
        }
        btn_stk.setOnClickListener {
            val simToolKitLaunchIntent = this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if (simToolKitLaunchIntent !=null){
                startActivity(simToolKitLaunchIntent);
            }

        }
        btn_camera.setOnClickListener {

        }
        btn_dial.setOnClickListener {
            makeCall("0722222445")
        }
        btn_share.setOnClickListener {
            share("hello","greetings")
        }
        btn_email.setOnClickListener {
            email("349429hnw@gmail.com","Greetings","Hello")
        }

    }
}