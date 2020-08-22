package com.example.southvalleyuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class students extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        WebView myWebView = findViewById(R.id.webView_students);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.svu.edu.eg/arabic/Students/high_mang.html");
        myWebView.getSettings().setBuiltInZoomControls(true);
    }
}
