package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rjiftarir_dowa extends AppCompatActivity {
    Button rjifbackbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rjiftarir_dowa);

        rjifbackbt = findViewById(R.id.iftaback);
        rjifbackbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rjiftarir_dowa.this,rojaerdowa.class);
                startActivity(intent);
            }
        });
    }
}
