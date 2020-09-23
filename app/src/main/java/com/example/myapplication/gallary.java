package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gallary extends AppCompatActivity {

    CardView maccabtn,modinabtn,baitulmkkerrombtn,guthiabtn,hatajaribtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);

        maccabtn=findViewById(R.id.moccasorif);
       modinabtn=findViewById(R.id.modinasorif);
       baitulmkkerrombtn=findViewById(R.id.baitulmoccerrom);
        guthiabtn=findViewById(R.id.gutiamocs);
      hatajaribtn=findViewById(R.id.madrasah);

      maccabtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(gallary.this,mecca_dis.class);
              startActivity(intent);
          }
      });

       modinabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gallary.this,modina.class);
                startActivity(intent);
            }
        });
       baitulmkkerrombtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gallary.this,baitul_mukkerrom.class);
                startActivity(intent);
            }
        });
        guthiabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gallary.this,Guthia_moqse.class);
                startActivity(intent);
            }
        });
        hatajaribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gallary.this,hatajari_madrasah.class);
                startActivity(intent);
            }
        });
    }
}
