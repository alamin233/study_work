package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tarabirmonajat extends AppCompatActivity {
    public Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarabirmonajat);

        buttonback = findViewById(R.id.tarmonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tarabirmonajat.this,rojaerdowa.class);
                startActivity(intent);
            }
        });
    }
}
