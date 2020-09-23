package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hazzz_er_foroj extends AppCompatActivity {
    Button  hfback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazzz_er_foroj);

        hfback = findViewById(R.id.hazzforojback);
        hfback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazzz_er_foroj.this,hazz_erbisoe.class);
                startActivity(intent);
            }
        });
    }
}
