package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class mergedwebview extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mergedwebview);
        webView=findViewById(R.id.webView);
        Intent intent = getIntent();
        String value = intent.getStringExtra("spacex");
        if(value.equals("prechi")){
            webView.loadUrl("file:///android_asset/precaution.html");
        }
        if(value.equals("aboutushi")){
            webView.loadUrl("file:///android_asset/aboutus.html");
        }
        if(value.equals("tchi")){
            webView.loadUrl("file:///android_asset/tc.html");
        }
    }
}