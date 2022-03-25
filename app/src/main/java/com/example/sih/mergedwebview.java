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
        if(value.equals("prechi") || value.equals("precshi") || value.equals("precthi") || value.equals("preclhi") || value.equals("precwhi")){
            webView.loadUrl("file:///android_asset/precaution.html");
        }
        if(value.equals("aboutushi") || value.equals("aboutusshi") || value.equals("aboutusthi") || value.equals("aboutuslhi") || value.equals("aboutuswhi")){
            webView.loadUrl("file:///android_asset/aboutus.html");
        }
        if(value.equals("tnchi") || value.equals("tncshi") || value.equals("tncthi") || value.equals("tnclhi") || value.equals("tncwhi")){
            webView.loadUrl("file:///android_asset/txc.html");
        }
        if(value.equals("dishi") || value.equals("disshi") || value.equals("disthi") || value.equals("dislhi") || value.equals("diswhi")){
            webView.loadUrl("https://zeenews.india.com/uttarakhand");
        }
        if(value.equals("faqhi") || value.equals("faqshi") || value.equals("faqthi") || value.equals("faqlhi") || value.equals("faqwhi")){
            webView.loadUrl("file:///android_asset/faq.html");
        }
    }
}