package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazermasala extends AppCompatActivity {
    public Button namforoj,naamwajib,naamsunnat,naammustahab,naamvongerkaron,naamback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazermasala);

        namforoj=findViewById(R.id.maszerfro);
        naamwajib = findViewById(R.id.maswajib);
        naamsunnat = findViewById(R.id.massunnat);
        naammustahab = findViewById(R.id.masmustahab);
        naamvongerkaron = findViewById(R.id.masvongkaron);
        naamback = findViewById(R.id.masback);

        namforoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,namazerforoj.class);
                startActivity(intent);
            }
        });
        naamwajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,namazerwajiv.class);
                startActivity(intent);
            }
        });
        naamsunnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,nazersunnatt.class);
                startActivity(intent);
            }
        });
        naammustahab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,namazermustahabb.class);
                startActivity(intent);
            }
        });
        naamvongerkaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,namazervongerkaronn.class);
                startActivity(intent);
            }
        });
        naamback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazermasala.this,namaza.class);
                startActivity(intent);
            }
        });


    }
}
