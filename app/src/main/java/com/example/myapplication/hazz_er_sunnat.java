package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hazz_er_sunnat extends AppCompatActivity {
    Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazz_er_sunnat);

        buttonback = findViewById(R.id.hazzsunback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hazz_er_sunnat.this,hazz_erbisoe.class);
                startActivity(intent);
            }
        });
    }
}
