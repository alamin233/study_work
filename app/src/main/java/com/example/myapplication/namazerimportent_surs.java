package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazerimportent_surs extends AppCompatActivity {
    Button sfile,sfalaq,snas,sfatiha, imsback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazerimportent_surs);

        sfile = findViewById(R.id.FILE);
        sfalaq = findViewById(R.id.FALAQ);
        snas = findViewById(R.id.NAS);
        sfatiha = findViewById(R.id.fatiha);

        imsback = findViewById(R.id.suraback);
        imsback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazerimportent_surs.this,namazz.class);
                startActivity(intent);
                finish();
            }
        });
        sfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namazerimportent_surs.this,sura_fil.class);
                startActivity(intent);
                finish();
            }
        });
        sfalaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namazerimportent_surs.this,sura_falaq.class);
                startActivity(intent);
                finish();
            }
        });
        snas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namazerimportent_surs.this,sura_nas.class);
                startActivity(intent);
                finish();
            }
        });
        sfatiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namazerimportent_surs.this,sura_fatiha.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
