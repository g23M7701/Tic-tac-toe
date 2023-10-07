package com.example.tictactoeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TTTsplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tttsplash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(TTTsplash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3*1000); //keeps the splash screen around for 3 seconds
    };
}