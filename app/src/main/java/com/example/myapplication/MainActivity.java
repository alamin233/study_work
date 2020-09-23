package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.gridvew);
      final String[] stringsss = getResources().getStringArray(R.array.name_list);
      final ArrayAdapter<String> adapters = new ArrayAdapter<>(MainActivity.this,R.layout.grittex,R.id.tew,stringsss);
      gridView.setAdapter(adapters);
      gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
              String value ="your file open"+ adapters.getItem(position);
              String value1 = "witi open your file"+ adapters.getItem(position);
              String value2 = "witi open your file hazz"+ adapters.getItem(position);
              String value3 = "witi open your file zakat"+ adapters.getItem(position);


              if (position==0){
                  Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
                  Intent intent = new Intent(MainActivity.this,namazz.class);
                  startActivity(intent);
              }
              else if (position==1){
                  Toast.makeText(getApplicationContext(),value1,Toast.LENGTH_LONG).show();
                  Intent intent = new Intent(MainActivity.this,rojaerdowa.class);
                  startActivity(intent);
              }
              else if (position==2){
                  Toast.makeText(getApplicationContext(),value2,Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(MainActivity.this,hazz_erbisoe.class);
                  startActivity(intent);
              }
              else if (position==3){
                  Toast.makeText(getApplicationContext(),value3,Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(MainActivity.this,zakat_Er_bisoe.class);
                  startActivity(intent);
              }

          }
      });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(MainActivity.this,home.class);
            startActivity(intent);

            // Handle the camera action
        }
        else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainActivity.this,gallary.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(MainActivity.this,sideshow.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_tools) {
            Intent intent = new Intent(MainActivity.this,Toolse.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_share) {
            Intent intent = new Intent(MainActivity.this,saher.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_send) {
            Intent intent = new Intent(MainActivity.this,Send.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
