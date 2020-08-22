package com.example.southvalleyuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        WebView myWebView = findViewById(R.id.webView_twitter);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://twitter.com/S_v_university");
        myWebView.getSettings().setBuiltInZoomControls(true);
    }
}
