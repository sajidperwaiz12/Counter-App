package com.sajidperwaiz.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button incrementBtn, decrementBtn, resetBtn;
    int counter = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementBtn = findViewById(R.id.incrementBtn);
        decrementBtn = findViewById(R.id.decrementBtn);
        welcome_text = findViewById(R.id.welcome_text);
        counter_text = findViewById(R.id.counterText);
        resetBtn = findViewById(R.id.resetBtn);

        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + increaseCounter());
            }
        });

        decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + decrementCounter());
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("0");
                counter = 0;
            }
        });

    }


    public int increaseCounter() {
        return ++counter;
    }

    public int decrementCounter() {
        if (counter <= 0) {
            return 0;
        }
        return --counter;
    }
}