package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class zakat_Er_bisoe extends AppCompatActivity {
    public Button buttonzakatkaderuporefroj,buttonjakatkhat,buttonzakatbac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat__er_bisoe);

      buttonzakatkaderuporefroj = findViewById(R.id.zakaforoj);
      buttonjakatkhat = findViewById(R.id.zakatkat);
    buttonzakatbac = findViewById(R.id.zakatback);

    buttonzakatkaderuporefroj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intant = new Intent(zakat_Er_bisoe.this,Zakt_kader_pore_foroj.class);
            startActivity(intant);
        }
    });
       buttonjakatkhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intant = new Intent(zakat_Er_bisoe.this,Zakater_khtsmuho.class);
                startActivity(intant);
            }
        });
       buttonzakatbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intant = new Intent(zakat_Er_bisoe.this,MainActivity.class);
                startActivity(intant);
            }
        });
    }
}
