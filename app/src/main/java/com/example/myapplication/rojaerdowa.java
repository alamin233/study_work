package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rojaerdowa extends AppCompatActivity {
    Button niatbt,ifterbt,trabirdobt,trmonajat,rojaback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rojaerdowa);

        niatbt = findViewById(R.id.rjniat);
        ifterbt = findViewById(R.id.ifniat);
        trabirdobt = findViewById(R.id.trdowa);
        trmonajat = findViewById(R.id.trmonjat);
        rojaback = findViewById(R.id.rjback);

        niatbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rojaerdowa.this,sahirirdowa.class);
                startActivity(intent);
            }
        });
        ifterbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rojaerdowa.this,rjiftarir_dowa.class);
                startActivity(intent);
            }
        });
        trabirdobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rojaerdowa.this,Tarabirdo.class);
                startActivity(intent);
            }
        });
        trmonajat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rojaerdowa.this,Tarabirmonajat.class);
                startActivity(intent);
            }
        });
        rojaback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rojaerdowa.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
