package com.example.try3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class spelling extends AppCompatActivity {

    private EditText userInput;
    private Button checkButton;
    private TextView questionText;
    private TextView resultText;

    private String[] words = {"apple", "banana", "elephant", "computer"};
    private String[] syllables = {"ap-ple", "ba-na-na", "e-le-phant", "com-pu-ter"};
    private String currentWord;
    private String currentSyllables;
    private boolean answeredCorrectly;
    private int questionCounter;
    private int maxQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spelling);

        userInput = findViewById(R.id.userInput);
        checkButton = findViewById(R.id.checkButton);
        questionText = findViewById(R.id.questionText);
        resultText = findViewById(R.id.resultText);

        maxQuestions = words.length;
        questionCounter = 0;
        generateQuestion();

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userSyllables = userInput.getText().toString();
                if (userSyllables.equalsIgnoreCase(currentSyllables)) {
                    resultText.setText("Correct!");
                    answeredCorrectly = true;
                } else {
                    resultText.setText("Incorrect. Please try again.");
                    answeredCorrectly = false;
                }
                userInput.getText().clear();
                if (answeredCorrectly) {
                    questionCounter++;
                    if (questionCounter == maxQuestions) {
                        resultText.setText("COMPLETED");
                        checkButton.setEnabled(false);
                    } else {
                        generateQuestion();
                    }
                }
            }
        });

        ImageButton imageButton61 = findViewById(R.id.spellingback);
        imageButton61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the learningmenu activity
                Intent intent = new Intent(spelling.this, learningmenu.class);
                startActivity(intent);
            }
        });
    }

    private void generateQuestion() {
        currentWord = words[questionCounter];
        currentSyllables = syllables[questionCounter];
        questionText.setText("spell the word : " + currentWord);
        resultText.setText("");
        answeredCorrectly = false;
    }
}