package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zakater_khtsmuho extends AppCompatActivity {
    public Button buttonzaktkhatback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakater_khtsmuho);

        buttonzaktkhatback = findViewById(R.id.zakakhtback);
        buttonzaktkhatback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zakater_khtsmuho.this,zakat_Er_bisoe.class);
                startActivity(intent);
            }
        });
    }
}
