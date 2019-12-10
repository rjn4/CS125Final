package com.example.cs125final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button click = findViewById(R.id.charButton);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(MenuActivity.this, CharActivity.class);
                startActivity(intent1);
                finish();
            }
        });
        Button stab = findViewById(R.id.location);
        stab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View look) {
                Intent doThis = new Intent(MenuActivity.this, LocActivity.class);
                startActivity(doThis);
                finish();
            }
        });
        Button button = findViewById(R.id.buttonDiceRoller);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
