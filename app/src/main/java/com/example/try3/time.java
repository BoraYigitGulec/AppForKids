package com.example.try3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        ImageButton imageButton32 = findViewById(R.id.timeback);
        imageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the learningmenu activity
                Intent intent = new Intent(time.this, learningmenu.class);
                startActivity(intent);
            }
        });
    }
}