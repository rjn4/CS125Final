package com.example.cs125final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import


public class CharActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.char_main);
        Button maleName = (Button) findViewById(R.id.male_first);
        maleName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView result = findViewById(R.id.result);
                result.setText("            Matthew");
            }
        });
        Button femaleName = (Button) findViewById(R.id.female_first);
        femaleName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView result = findViewById(R.id.result);
                result.setText("            Rachel");
            }
        });
        Button surname = (Button) findViewById(R.id.surname);
        surname.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView lastName = findViewById(R.id.textLastName);
                lastName.setText("steve");
            }
        });
        Button charReturn = findViewById(R.id.returnFromChar);
        charReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(CharActivity.this, MenuActivity.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}