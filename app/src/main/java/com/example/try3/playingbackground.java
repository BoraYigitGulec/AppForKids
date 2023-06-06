package com.example.try3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class playingbackground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingbackground);

        ImageButton imageButton7 = findViewById(R.id.playingbackbutton);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(playingbackground.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton42 = findViewById(R.id.imageButton5);
        imageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(playingbackground.this, similarpictures.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton44 = findViewById(R.id.imageButton4);
        imageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(playingbackground.this, catchball.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton45 = findViewById(R.id.imageButton6);
        imageButton45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(playingbackground.this, reverse.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton46 = findViewById(R.id.imageButton7);
        imageButton46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(playingbackground.this, remembering.class);
                startActivity(intent);
            }
        });
    }
}