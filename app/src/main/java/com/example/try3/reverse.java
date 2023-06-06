package com.example.try3;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class reverse extends AppCompatActivity {

    TextView tv_level, tv_number;
    EditText et_number;
    Button b_confirm, b_tryAgain;
    int currentLevel = 1;
    Random r;
    String generatedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        tv_level = findViewById(R.id.tv_level);
        tv_number = findViewById(R.id.tv_number);
        et_number = findViewById(R.id.et_number);
        b_confirm = findViewById(R.id.b_confirm);
        b_tryAgain = findViewById(R.id.b_try_again);
        r = new Random();

        // Set up initial display
        setUpDisplay();

        b_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if the numbers are the same
                if (generatedNumber.equals(et_number.getText().toString())) {
                    // Increase the level
                    currentLevel++;

                    // Check if the player reached level 7
                    if (currentLevel <= 7) {
                        // Update display
                        setUpDisplay();
                    } else {
                        tv_level.setText("Congratulations! You reached level 7.");
                        b_confirm.setEnabled(false);
                        b_tryAgain.setVisibility(View.VISIBLE);
                    }
                } else {
                    tv_level.setText("Game Over! The number was " + generatedNumber);
                    b_confirm.setEnabled(false);
                    b_tryAgain.setVisibility(View.VISIBLE);
                }
            }
        });


        b_tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset the game
                currentLevel = 1;
                et_number.setText("");
                b_confirm.setEnabled(true);
                b_tryAgain.setVisibility(View.GONE);

                // Update display
                setUpDisplay();
            }
        });
    }

    private void setUpDisplay() {
        // Display current level
        tv_level.setText("Level: " + currentLevel);

        // Clear the input field
        et_number.setText("");

        // Display random number according to the level
        generatedNumber = generateNumber(currentLevel);
        tv_number.setText(generateReversedNumber(generatedNumber));

        // Hide input and button, show number
        et_number.setVisibility(View.GONE);
        b_confirm.setVisibility(View.GONE);
        tv_number.setVisibility(View.VISIBLE);

        // Delayed display of elements after two seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                et_number.setVisibility(View.VISIBLE);
                b_confirm.setVisibility(View.VISIBLE);
                tv_number.setVisibility(View.GONE);
                et_number.requestFocus();
            }
        }, 2000);
    }


    private String generateNumber(int digits) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < digits; i++) {
            int randomDigit = r.nextInt(10);
            output.append(randomDigit);
        }
        return output.toString();
    }

    private String generateReversedNumber(String number) {
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNumber.append(number.charAt(i));
        }
        return reversedNumber.toString();
    }
}
