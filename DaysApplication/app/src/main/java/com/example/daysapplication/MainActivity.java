package com.example.daysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSunday,buttonMonday,buttonTuesday,buttonWednesday,buttonThursday,buttonFriday,buttonSaturday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         buttonSunday = findViewById(R.id.buttonSunday);
         buttonMonday = findViewById(R.id.buttonMonday);
         buttonTuesday = findViewById(R.id.buttonTuesday);
         buttonWednesday = findViewById(R.id.buttonWednesday);
         buttonThursday = findViewById(R.id.buttonThursday);
         buttonFriday = findViewById(R.id.buttonFriday);
         buttonSaturday = findViewById(R.id.buttonSaturday);

         final MediaPlayer mediaPlayer1= MediaPlayer.create(this,R.raw.sunday);
         final MediaPlayer mediaPlayer2= MediaPlayer.create(this,R.raw.monday);
         final MediaPlayer mediaPlayer3= MediaPlayer.create(this,R.raw.tuesday);
         final MediaPlayer mediaPlayer4= MediaPlayer.create(this,R.raw.wednesday);
         final MediaPlayer mediaPlayer5= MediaPlayer.create(this,R.raw.thursday);
         final MediaPlayer mediaPlayer6= MediaPlayer.create(this,R.raw.friday);
         final MediaPlayer mediaPlayer7= MediaPlayer.create(this,R.raw.saturday);



        buttonSunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }


        });
        buttonMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }


        });
        buttonTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }


        });
        buttonWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }


        });
        buttonThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }


        });
        buttonFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }


        });
        buttonSaturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }


        });



    }
}