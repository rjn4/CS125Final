package com.example.cs125final;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.xdrop.jrand.JRand;

public class LocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_main);

        Button countryGen = (Button) findViewById(R.id.countryGen);
        countryGen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v1) {
                TextView country = findViewById(R.id.country);
                country.setText("               " + JRand.country().genString());
            }
        });

        Button cityGen = (Button) findViewById(R.id.cityGen);
        cityGen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                TextView city = findViewById(R.id.city);
                city.setText("               " + JRand.city().genString());
            }
        });

        Button streetGen = (Button) findViewById(R.id.streetGen);
        streetGen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v3) {
                TextView street = findViewById(R.id.street);
                street.setText("               " + JRand.street().genString());
            }
        });
        Button returnMenu = (Button) findViewById(R.id.returnButton);
        returnMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v4) {
                Intent intent4 = new Intent(LocActivity.this, MenuActivity.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}
