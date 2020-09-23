package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class logu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logu);
        Thread spthread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent splash = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(splash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        spthread.start();


    }
}
