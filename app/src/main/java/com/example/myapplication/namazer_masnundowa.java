package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namazer_masnundowa extends AppCompatActivity {
    Button buttonbcak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namazer_masnundowa);
        buttonbcak = findViewById(R.id.masnunback);

        buttonbcak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namazer_masnundowa.this,namazz.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
