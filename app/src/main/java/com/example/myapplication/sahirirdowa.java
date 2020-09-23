package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sahirirdowa extends AppCompatActivity {
    Button sehbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahirirdowa);
        sehbt = findViewById(R.id.seheriback);
        sehbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sahirirdowa.this,rojaerdowa.class);
                startActivity(intent);
            }
        });
    }
}
