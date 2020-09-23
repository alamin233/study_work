package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazermustahabb extends AppCompatActivity {
    Button nammustahabback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazermustahabb);

        nammustahabback = findViewById(R.id.nmback);
        nammustahabback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermustahabb.this,namazermasala.class);
                startActivity(intent);
            }
        });
    }
}
