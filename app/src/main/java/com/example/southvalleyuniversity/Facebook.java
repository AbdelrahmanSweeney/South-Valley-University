package com.example.southvalleyuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        WebView myWebView = findViewById(R.id.webView_facebook);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.facebook.com/svuar?ref=hl");
        myWebView.getSettings().setBuiltInZoomControls(true);
    }
}
