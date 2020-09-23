package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazz extends AppCompatActivity {
    public Button ojurrulse,masaala,namamasnundowa,nanazzbakk,importentsur,nammonaja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazz);

        ojurrulse=findViewById(R.id.ruls);
        masaala = findViewById(R.id.Masalaa);
        namamasnundowa = findViewById(R.id.dowa);
        nanazzbakk = findViewById(R.id.namazzback);
        importentsur = findViewById(R.id.sura);
        nammonaja = findViewById(R.id.mona);

       ojurrulse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namazz.this,namaza.class);
                startActivity(intent);
            }
        });
       masaala.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(namazz.this,namazermasala.class);
               startActivity(intent);
           }
       });
         namamasnundowa.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(namazz.this,namazer_masnundowa.class);
                 startActivity(intent);
             }
         });
         nanazzbakk.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(namazz.this,MainActivity.class);
                 startActivity(intent);
             }
         });
         importentsur.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(namazz.this,namazerimportent_surs.class);
                 startActivity(intent);
             }
         });
         nammonaja.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(namazz.this,monajaterdowa.class);
                 startActivity(intent);
             }
         });



    }
}
