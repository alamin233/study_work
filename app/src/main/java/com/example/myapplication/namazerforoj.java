package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazerforoj extends AppCompatActivity {
Button nafrojbatton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazerforoj);

        nafrojbatton = findViewById(R.id.nfback);
        nafrojbatton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazerforoj.this,namazermasala.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
