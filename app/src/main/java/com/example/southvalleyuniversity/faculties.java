package com.example.southvalleyuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class faculties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);
        WebView myWebView = findViewById(R.id.webView_faculties);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.svu.edu.eg/arabic/Faculty/index.html");
        myWebView.getSettings().setBuiltInZoomControls(true);

    }
}
