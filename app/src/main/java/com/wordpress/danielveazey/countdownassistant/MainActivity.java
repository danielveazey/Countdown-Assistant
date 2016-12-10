package com.wordpress.danielveazey.countdownassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lettersRound(View view) {
        Intent lettersIntent = new Intent(MainActivity.this, LettersActivity.class);
        startActivity(lettersIntent);
    }

    public void numbersRound(View view) {
        Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(numbersIntent);
    }
}
