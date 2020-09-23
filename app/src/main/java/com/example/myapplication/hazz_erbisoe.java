package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hazz_erbisoe extends AppCompatActivity {
    public Button hazzfo,hazzwaj,hazzsunna,hazzback_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazz_erbisoe);

        hazzfo = findViewById(R.id.hazz_foro);
        hazzwaj = findViewById(R.id.hazz_waji);
        hazzsunna = findViewById(R.id.hazz_sun);
        hazzback_bt = findViewById(R.id.hzzback);

        hazzfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazz_erbisoe.this,hazzz_er_foroj.class);
                startActivity(intent);
            }
        });
        hazzwaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazz_erbisoe.this,hazz_er_wajiv.class);
                startActivity(intent);
            }
        });
       hazzsunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazz_erbisoe.this,hazz_er_sunnat.class);
                startActivity(intent);
            }
        });
        hazzback_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazz_erbisoe.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
