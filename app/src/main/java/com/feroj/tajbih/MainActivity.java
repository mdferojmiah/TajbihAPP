package com.feroj.tajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView screen;
    Button addButton, subButton, resetButton;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        resetButton = findViewById(R.id.resetButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                screen.setText( count + "");

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                screen.setText( count + "" );

            }
        });

        resetButton.setOnClickListener(v -> {

            count = 0;
            screen.setText( count + "" );

        });


    }
}