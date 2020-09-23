package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monajaterdowa extends AppCompatActivity {
    Button mnajatbackk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monajaterdowa);

        mnajatbackk = findViewById(R.id.monaback);
        mnajatbackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monajaterdowa.this,namazz.class);
                startActivity(intent);
            }
        });
    }
}
