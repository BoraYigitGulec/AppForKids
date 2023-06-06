package com.example.try3;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class catchball extends AppCompatActivity {

    private Button startButton, restartButton;
    private TextView scoreTextView, timeTextView, gameOverTextView;
    private ImageView ballImageView;

    private int score;
    private int timeLeft;
    private boolean gameStarted;
    private CountDownTimer countDownTimer;
    private Random random;
    private CountDownTimer ballCountDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catchball);

        startButton = findViewById(R.id.startButton);
        restartButton = findViewById(R.id.restartButton);
        scoreTextView = findViewById(R.id.scoreTextView);
        timeTextView = findViewById(R.id.timeTextView);
        ballImageView = findViewById(R.id.ballImageView);
        gameOverTextView = findViewById(R.id.gameOverTextView);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });

        ballImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN && gameStarted) {
                    ballImageView.setVisibility(View.INVISIBLE);
                    score++;
                    scoreTextView.setText("Score: " + score);
                    spawnBall();
                    return true;
                }
                return false;
            }
        });
    }

    private void startGame() {
        startButton.setVisibility(View.INVISIBLE);
        restartButton.setVisibility(View.INVISIBLE);
        gameOverTextView.setVisibility(View.INVISIBLE);

        score = 0;
        timeLeft = 20;
        gameStarted = true;
        random = new Random();

        scoreTextView.setText("Score: " + score);
        timeTextView.setText("Time: " + timeLeft);

        countDownTimer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft--;
                timeTextView.setText("Time: " + timeLeft);
            }

            @Override
            public void onFinish() {
                gameStarted = false;
                ballImageView.setVisibility(View.INVISIBLE);
                gameOverTextView.setVisibility(View.VISIBLE);
                restartButton.setVisibility(View.VISIBLE);
            }
        }.start();

        spawnBall();
    }

    private void resetGame() {
        startButton.setVisibility(View.VISIBLE);
        restartButton.setVisibility(View.INVISIBLE);
        gameOverTextView.setVisibility(View.INVISIBLE);

        countDownTimer.cancel();
        timeTextView.setText("Time: 20");

        score = 0;
        scoreTextView.setText("Score: " + score);

        ballImageView.setVisibility(View.INVISIBLE);
    }

    private void spawnBall() {
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int screenHeight = getResources().getDisplayMetrics().heightPixels;

        int ballWidth = ballImageView.getWidth();
        int ballHeight = ballImageView.getHeight();

        int maxX = screenWidth - ballWidth;
        int maxY = screenHeight - ballHeight;

        random = new Random();
        int randomX = random.nextInt(maxX);
        int randomY = random.nextInt(maxY);

        ballImageView.setX(randomX);
        ballImageView.setY(randomY);
        ballImageView.setVisibility(View.VISIBLE);

        ballCountDownTimer = new CountDownTimer(3500, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                if (gameStarted && ballImageView.getVisibility() == View.VISIBLE) {
                    ballImageView.setVisibility(View.INVISIBLE);
                    spawnBall();
                }
            }
        }.start();
    }
}