package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namaza extends AppCompatActivity {
    public Button ojuredowa,ojutorika,ojufroj,tamforoj,gosforoj,ojuvonger, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaza);

        ojuredowa=findViewById(R.id.ojdowa);
        ojutorika=findViewById(R.id.torika);
        ojufroj= findViewById(R.id.ojfroz);
        tamforoj = findViewById(R.id.taforoz);
        gosforoj = findViewById(R.id.goforoz);
        ojuvonger = findViewById(R.id.ojvongo);
        back=findViewById(R.id.ba);

        ojuredowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(namaza.this,ojurdowa.class);
                startActivity(intent);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(namaza.this,namazz.class);
                startActivity(intent);
            }
        });
        ojutorika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namaza.this,ojusunnat.class);
                startActivity(intent);
            }
        });
        ojufroj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namaza.this,ojufro.class);
                startActivity(intent);
            }
        });
        tamforoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namaza.this,taemmomfro.class);
                startActivity(intent);
            }
        });
        gosforoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namaza.this,gosoforoj.class);
                startActivity(intent);
            }
        });

       ojuvonger.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(namaza.this,ojuvongerkaroon.class);
               startActivity(intent);
           }
       });
    }
}
