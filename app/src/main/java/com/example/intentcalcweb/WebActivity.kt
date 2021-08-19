package com.example.intentcalcweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webViewSetup()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(){
     webView.webViewClient= WebViewClient()
     webView.apply {
         loadUrl("https://www.google.com/")
         settings.javaScriptEnabled=true
         settings.safeBrowsingEnabled=true
     }
    }

    override fun onBackPressed() {
        if (webView.canGoBack())webView.goBack()else super.onBackPressed()
    }
}