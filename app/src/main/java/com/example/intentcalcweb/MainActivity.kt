package com.example.intentcalcweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_Calc.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
        btn_Intent.setOnClickListener {
            val intent1 = Intent(this, IntentActivity::class.java)
            startActivity(intent1)

        }
        btn_webview.setOnClickListener {
            val intent2 = Intent(this, WebActivity::class.java)
            startActivity(intent2)
            }
        }
    }
