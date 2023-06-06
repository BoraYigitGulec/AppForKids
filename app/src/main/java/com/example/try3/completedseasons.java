package com.example.try3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class completedseasons extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completedseasons);

        Button buttonspring = findViewById(R.id.buttonspring);

        Button buttonsummer = findViewById(R.id.buttonsummer);

        Button buttonwinter = findViewById(R.id.buttonwinter);
        Button buttonfall = findViewById(R.id.buttonfall);

        VideoView videoView3 = findViewById(R.id.videoView3);

        buttonsummer.setOnClickListener(v -> {
            String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.summer;
            videoView3.setVideoURI(Uri.parse(videoPath1));
            videoView3.start();
        });
        buttonspring.setOnClickListener(v -> {
            String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.spring;
            videoView3.setVideoURI(Uri.parse(videoPath2));
            videoView3.start();
        });
        buttonwinter.setOnClickListener(v -> {
            String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.winter;
            videoView3.setVideoURI(Uri.parse(videoPath3));
            videoView3.start();
        });
        buttonfall.setOnClickListener(v -> {
            String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.fall;
            videoView3.setVideoURI(Uri.parse(videoPath4));
            videoView3.start();
        });


    }
}