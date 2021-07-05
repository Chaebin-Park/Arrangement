package com.example.measure

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val settings = UI_WebView.settings
        settings.javaScriptEnabled=true
        val url = intent.getStringExtra("url")
        if (url != null) {
            UI_WebView.loadUrl(url)
        }
    }
}
