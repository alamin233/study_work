package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazervongerkaronn extends AppCompatActivity {
    Button namvonggerkaron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazervongerkaronn);

        namvonggerkaron = findViewById(R.id.nvback);
        namvonggerkaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazervongerkaronn.this,namazermasala.class);
                startActivity(intent);
            }
        });
    }
}
