package com.example.kyrsovay;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VariablesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);

        Button button = findViewById(R.id.button3var);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(VariablesActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}

