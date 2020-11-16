package com.example.android_14_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        google_map();
    }
    private void google_map(){
        Intent googlemap = new Intent(Intent.ACTION_VIEW);
        startActivity(googlemap);
        finish();
    }
}