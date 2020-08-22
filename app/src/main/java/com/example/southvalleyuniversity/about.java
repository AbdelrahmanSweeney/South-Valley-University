package com.example.southvalleyuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView myWebView = findViewById(R.id.webView_about);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.svu.edu.eg/arabic/aboutSVU/index.html");
        myWebView.getSettings().setBuiltInZoomControls(true);
    }
}
