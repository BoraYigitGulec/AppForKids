package com.example.try3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_learning = findViewById(R.id.button_learning);
        b_learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the LearningMenuActivity
                Intent intent = new Intent(MainActivity.this, learningmenu.class);
                startActivity(intent);
            }
        });
        Button b_playing = findViewById(R.id.button_playing);
        b_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the LearningMenuActivity
                Intent intent = new Intent(MainActivity.this, playingbackground.class);
                startActivity(intent);
            }
        });

    }
}