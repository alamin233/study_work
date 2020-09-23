package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zakt_kader_pore_foroj extends AppCompatActivity {
    public Button buttonzakatforojbk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakt_kader_pore_foroj);

        buttonzakatforojbk = findViewById(R.id.zakatfojback);
        buttonzakatforojbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zakt_kader_pore_foroj.this,zakat_Er_bisoe.class);
                startActivity(intent);
            }
        });
    }
}
