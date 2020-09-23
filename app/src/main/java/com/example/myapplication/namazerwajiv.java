package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazerwajiv extends AppCompatActivity {
    Button wajibbuttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazerwajiv);

        wajibbuttonback = findViewById(R.id.nwback);
        wajibbuttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazerwajiv.this,namazermasala.class);
                startActivity(intent);
            }
        });
    }
}
