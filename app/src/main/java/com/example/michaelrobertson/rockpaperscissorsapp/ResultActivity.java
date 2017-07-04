package com.example.michaelrobertson.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.michaelrobertson.rockpaperscissorsapp.R.id.txt_player_choice;

public class ResultActivity extends AppCompatActivity {

    TextView txt_player_choice;
    TextView txt_computer_choice;
    TextView txt_result_of_game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        asigns the text views to what is initialized at the top.
        txt_player_choice = (TextView)findViewById(R.id.txt_player_choice);
        txt_computer_choice = (TextView)findViewById(R.id.txt_computer_choice);
        txt_result_of_game = (TextView)findViewById(R.id.txt_result_of_game);

//        recieves the intent(result) from which button was clicked.(userChoice)
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String userChoice = extras.getString("userChoice");

        String computerChoice = Game.getComputerMove();
        int gameResultValue = Game.compareMoves(userChoice, computerChoice);
        String gameResult = Game.getWinner(gameResultValue);

//        sets the text properties on the app(TextView) to the strings calculated.
        txt_player_choice.setText(userChoice);
        txt_computer_choice.setText(computerChoice);
        txt_result_of_game.setText(gameResult);
    }
}
