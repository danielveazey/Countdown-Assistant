package com.wordpress.danielveazey.countdownassistant;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


public class LettersActivity extends AppCompatActivity {

    private int placeHolder = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        final ArrayList<String> vowels = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            vowels.add("A");
        }

        for (int i = 0; i < 21; i++) {
            vowels.add("E");
        }

        for (int i = 0; i < 15; i++) {
            vowels.add("I");
        }

        for (int i = 0; i < 15; i++) {
            vowels.add("O");
        }

        for (int i = 0; i < 5; i++) {
            vowels.add("U");
        }

        Collections.shuffle(vowels);

        final ArrayList<String> consonants = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            consonants.add("B");
        }

        for (int i = 0; i < 3; i++) {
            consonants.add("C");
        }

        for (int i = 0; i < 6; i++) {
            consonants.add("D");
        }

        for (int i = 0; i < 2; i++) {
            consonants.add("F");
        }

        for (int i = 0; i < 3; i++) {
            consonants.add("G");
        }

        for (int i = 0; i < 2; i++) {
            consonants.add("H");
        }

        consonants.add("J");

        consonants.add("K");

        for (int i = 0; i < 5; i++) {
            consonants.add("L");
        }

        for (int i = 0; i < 4; i++) {
            consonants.add("M");
        }

        for (int i = 0; i < 8; i++) {
            consonants.add("N");
        }

        for (int i = 0; i < 4; i++) {
            consonants.add("P");
        }

        consonants.add("Q");

        for (int i = 0; i < 9; i++) {
            consonants.add("R");
        }

        for (int i = 0; i < 9; i++) {
            consonants.add("S");
        }

        for (int i = 0; i < 9; i++) {
            consonants.add("T");
        }

        consonants.add("V");

        consonants.add("W");

        consonants.add("X");

        consonants.add("Y");

        consonants.add("Z");

        Collections.shuffle(consonants);

        final Button timerButton = (Button) findViewById(R.id.timer_button);
        timerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                timerButton.setClickable(false);
                MediaPlayer mp = MediaPlayer.create(LettersActivity.this, R.raw.countdown1);
                mp.start();
            }
        });

        final TextView firstLetter = (TextView) findViewById(R.id.first_letter);
        final TextView secondLetter = (TextView) findViewById(R.id.second_letter);
        final TextView thirdLetter = (TextView) findViewById(R.id.third_letter);
        final TextView fourthLetter = (TextView) findViewById(R.id.fourth_letter);
        final TextView fifthLetter = (TextView) findViewById(R.id.fifth_letter);
        final TextView sixthLetter = (TextView) findViewById(R.id.sixth_letter);
        final TextView seventhLetter = (TextView) findViewById(R.id.seventh_letter);
        final TextView eighthLetter = (TextView) findViewById(R.id.eighth_letter);
        final TextView ninthLetter = (TextView) findViewById(R.id.ninth_letter);

        final ArrayList<TextView> letters = new ArrayList<>();

        letters.add(firstLetter);
        letters.add(secondLetter);
        letters.add(thirdLetter);
        letters.add(fourthLetter);
        letters.add(fifthLetter);
        letters.add(sixthLetter);
        letters.add(seventhLetter);
        letters.add(eighthLetter);
        letters.add(ninthLetter);

        final Button consonantButton = (Button) findViewById(R.id.consonant_button);
        consonantButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (placeHolder < 9) {
                    letters.get(placeHolder).setText(consonants.get(0));
                    consonants.remove(0);
                    placeHolder++;
                } else {
                    Toast.makeText(LettersActivity.this, "No more letters", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button vowelButton = (Button) findViewById(R.id.vowel_button);
        vowelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (placeHolder < 9) {
                    letters.get(placeHolder).setText(vowels.get(0));
                    vowels.remove(0);
                    placeHolder++;
                } else {
                    Toast.makeText(LettersActivity.this, "No more letters", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}