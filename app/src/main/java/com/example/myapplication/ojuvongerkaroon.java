package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ojuvongerkaroon extends AppCompatActivity {
public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojuvongerkaroon);

        button = findViewById(R.id.ojuvongbac);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ojuvongerkaroon.this,namaza.class);
                startActivity(intent);
            }
        });
    }
}
