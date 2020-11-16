package com.example.android_14_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        google_web();
    }
    public void google_web(){
        WebView webView = (WebView)findViewById(R.id.web1);
        webView.loadUrl("http://www.google.com");
        finish();
    }
}