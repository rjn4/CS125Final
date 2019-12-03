package com.example.cs125final;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        ImageButton androidImageButtonDie6 = (ImageButton) findViewById(R.id.imageButton);
        androidImageButtonDie6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("     6 Sided Die Roll: " +  (int)((Math.random() * 6) + 1));
            }
        });
        ImageButton androidImageButtonDie8 = (ImageButton) findViewById(R.id.d8);
        androidImageButtonDie8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("     8 Sided Die Roll: " +  (int)((Math.random() * 8) + 1));
            }
        });
        ImageButton androidImageButtonDie4 = (ImageButton) findViewById(R.id.d4);
        androidImageButtonDie4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("     4 Sided Die Roll: " +  (int)((Math.random() * 4) + 1));
            }
        });
        ImageButton androidImageButtonDie10 = (ImageButton) findViewById(R.id.d10);
        androidImageButtonDie10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("   10 Sided Die Roll: " +  (int)((Math.random() * 10) + 1));
            }
        });
        ImageButton androidImageButtonDie12 = (ImageButton) findViewById(R.id.d12);
        androidImageButtonDie12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("   12 Sided Die Roll: " +  (int)((Math.random() * 12) + 1));
            }
        });
        ImageButton androidImageButtonDie20 = (ImageButton) findViewById(R.id.d20);
        androidImageButtonDie20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textBox = findViewById(R.id.textBox);
                textBox.setText("   20 Sided Die Roll: " +  (int)((Math.random() * 20) + 1));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
