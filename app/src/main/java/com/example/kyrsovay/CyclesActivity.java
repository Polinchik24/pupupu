package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CyclesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cy1);

        Button button = findViewById(R.id.button1cycl);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(CyclesActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}
