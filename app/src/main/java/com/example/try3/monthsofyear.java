package com.example.try3;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monthsofyear extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthsofyear);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11= findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);

        final MediaPlayer mediaPlayer1= MediaPlayer.create(this,R.raw.january);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(this,R.raw.fabruary);
        final MediaPlayer mediaPlayer3= MediaPlayer.create(this,R.raw.march);
        final MediaPlayer mediaPlayer4= MediaPlayer.create(this,R.raw.april);
        final MediaPlayer mediaPlayer5= MediaPlayer.create(this,R.raw.may);
        final MediaPlayer mediaPlayer6= MediaPlayer.create(this,R.raw.june);
        final MediaPlayer mediaPlayer7= MediaPlayer.create(this,R.raw.july);
        final MediaPlayer mediaPlayer8= MediaPlayer.create(this,R.raw.august);
        final MediaPlayer mediaPlayer9= MediaPlayer.create(this,R.raw.september);
        final MediaPlayer mediaPlayer10= MediaPlayer.create(this,R.raw.october);
        final MediaPlayer mediaPlayer11= MediaPlayer.create(this,R.raw.november);
        final MediaPlayer mediaPlayer12= MediaPlayer.create(this,R.raw.december);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });

    }
}