package com.wordpress.danielveazey.countdownassistant;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumbersActivity extends AppCompatActivity {

    private String workingNumbers;
    private Random rand = new Random();
    private String targetNumber = Integer.toString(rand.nextInt(999 - 100 + 1) + 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList bigNumbers = new ArrayList();
        bigNumbers.add(100);
        bigNumbers.add(75);
        bigNumbers.add(50);
        bigNumbers.add(25);
        Collections.shuffle(bigNumbers);

        final ArrayList smallNumbers = new ArrayList();
        for (int i = 0; i < 10; i++) {
            smallNumbers.add(i+1);
            smallNumbers.add(i+1);
        }
        Collections.shuffle(smallNumbers);

        final TextView workers = (TextView) findViewById(R.id.numbers_textview);
        final TextView target = (TextView) findViewById(R.id.target_textview);

        final Button zeroBigButton = (Button) findViewById(R.id.zero_big);
        final Button oneBigButton = (Button) findViewById(R.id.one_big);
        final Button twoBigButton = (Button) findViewById(R.id.two_big);
        final Button threeBigButton = (Button) findViewById(R.id.three_big);
        final Button fourBigButton = (Button) findViewById(R.id.four_big);

        zeroBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                zeroBigButton.setClickable(false);
                oneBigButton.setClickable(false);
                twoBigButton.setClickable(false);
                threeBigButton.setClickable(false);
                fourBigButton.setClickable(false);
                workingNumbers = smallNumbers.get(0).toString() + "   " + smallNumbers.get(1).toString() + "   " +
                        smallNumbers.get(2).toString() + "   " + smallNumbers.get(3).toString() + "   " +
                        smallNumbers.get(4).toString() + "   " + smallNumbers.get(5).toString();

                workers.setText(workingNumbers);
                target.setText("Target: " + targetNumber);
            }
        });

        oneBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                zeroBigButton.setClickable(false);
                oneBigButton.setClickable(false);
                twoBigButton.setClickable(false);
                threeBigButton.setClickable(false);
                fourBigButton.setClickable(false);
                workingNumbers = bigNumbers.get(0).toString() + "   " + smallNumbers.get(0).toString() + "   " +
                        smallNumbers.get(1).toString() + "   " + smallNumbers.get(2).toString() + "   " +
                        smallNumbers.get(3).toString() + "   " + smallNumbers.get(4).toString();

                workers.setText(workingNumbers);
                target.setText("Target: " + targetNumber);
            }
        });

        twoBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                zeroBigButton.setClickable(false);
                oneBigButton.setClickable(false);
                twoBigButton.setClickable(false);
                threeBigButton.setClickable(false);
                fourBigButton.setClickable(false);
                workingNumbers = bigNumbers.get(0).toString() + "   " + bigNumbers.get(1).toString() + "   " +
                        smallNumbers.get(0).toString() + "   " + smallNumbers.get(1).toString() + "   " +
                        smallNumbers.get(2).toString() + "   " + smallNumbers.get(3).toString();

                workers.setText(workingNumbers);
                target.setText("Target: " + targetNumber);
            }
        });

        threeBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                zeroBigButton.setClickable(false);
                oneBigButton.setClickable(false);
                twoBigButton.setClickable(false);
                threeBigButton.setClickable(false);
                fourBigButton.setClickable(false);
                workingNumbers = bigNumbers.get(0).toString() + "   " + bigNumbers.get(1).toString() + "   " +
                        bigNumbers.get(2).toString() + "   " + smallNumbers.get(0).toString() + "   " +
                        smallNumbers.get(1).toString() + "   " + smallNumbers.get(2).toString();

                workers.setText(workingNumbers);
                target.setText("Target: " + targetNumber);
            }
        });

        fourBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                zeroBigButton.setClickable(false);
                oneBigButton.setClickable(false);
                twoBigButton.setClickable(false);
                threeBigButton.setClickable(false);
                fourBigButton.setClickable(false);
                workingNumbers = bigNumbers.get(0).toString() + "   " + bigNumbers.get(1).toString() + "   " +
                        bigNumbers.get(2).toString() + "   " + bigNumbers.get(3).toString() + "   " +
                        smallNumbers.get(0).toString() + "   " + smallNumbers.get(1).toString();

                workers.setText(workingNumbers);
                target.setText("Target: " + targetNumber);
            }
        });

        final Button timerButton = (Button) findViewById(R.id.timer_button);
        timerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                timerButton.setClickable(false);
                MediaPlayer mp = MediaPlayer.create(NumbersActivity.this, R.raw.countdown1);
                mp.start();
            }
        });
    }
}
