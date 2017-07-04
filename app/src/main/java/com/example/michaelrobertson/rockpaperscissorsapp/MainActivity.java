package com.example.michaelrobertson.rockpaperscissorsapp;

import android.app.Activity;
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

    public void onRockButtonClicked(View button){

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("userChoice", "Rock");
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button){

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("userChoice", "Paper");
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button){

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("userChoice", "Scissors");
        startActivity(intent);
    }
}
