package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button_var = findViewById(R.id.button2);
        button_var.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, VariablesActivity.class);
            startActivity(intent);
        });
        Button button_con = findViewById(R.id.button3);
        button_con.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ConditionsActivity.class);
            startActivity(intent);
        });
        Button button_list = findViewById(R.id.button4);
        button_list.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ListsActivity.class);
            startActivity(intent);
        });
        Button button_cycl = findViewById(R.id.button5);
        button_cycl.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this,CyclesActivity.class);
            startActivity(intent);
        });
    }
}