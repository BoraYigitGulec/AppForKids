package com.example.try3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class learningmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learningmenu);

        ImageButton imageButton7 = findViewById(R.id.learningbackbutton);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, carpma.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton9 = findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, directions.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton32 = findViewById(R.id.imageButton7);
        imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, spelling.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton42 = findViewById(R.id.imageButton4);
        imageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, time.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton41 = findViewById(R.id.imageButton);
        imageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, monthsofyear.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton221 = findViewById(R.id.imageButton2);
        imageButton221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, completedseasons.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton521 = findViewById(R.id.imageButton5);
        imageButton521.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(learningmenu.this, daysoftheweek.class);
                startActivity(intent);

            }
        });
    }
}