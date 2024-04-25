package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l1);

        Button button = findViewById(R.id.button1list);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(ListsActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}
