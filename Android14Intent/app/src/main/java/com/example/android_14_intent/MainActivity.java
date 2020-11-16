package com.example.android_14_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View v){
        Intent phone = new Intent(this, MainActivity2.class);
        startActivity(phone);
    }
    public void bt2(View v){
        Intent map = new Intent(this, MainActivity3.class);
        startActivity(map);
    }
    public void bt3(View v){
        Intent web = new Intent(this, MainActivity4.class);
        startActivity(web);
    }
}