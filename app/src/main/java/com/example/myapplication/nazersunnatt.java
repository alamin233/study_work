package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nazersunnatt extends AppCompatActivity {
    Button namzersunnaback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nazersunnatt);

        namzersunnaback = findViewById(R.id.nsback);
        namzersunnaback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nazersunnatt.this,namazermasala.class);
                startActivity(intent);
            }
        });
    }
}
