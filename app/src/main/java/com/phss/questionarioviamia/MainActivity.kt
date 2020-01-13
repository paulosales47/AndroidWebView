package com.phss.questionarioviamia

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.clearCache(true);

        myWebView.webViewClient = WebViewClient()

        myWebView.loadUrl("https://paulosales47.github.io/QuestionarioViaMia/");
    }
}