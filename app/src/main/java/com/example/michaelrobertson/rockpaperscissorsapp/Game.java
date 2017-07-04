package com.example.michaelrobertson.rockpaperscissorsapp;

import java.util.Random;

/**
 * Created by michaelrobertson on 04/07/2017.
 */

public class Game {

    public static String getComputerMove() {
        String[] moves = new String[]{"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

//    take the string from the button click and input it into the method.

    public static int compareMoves(String playerMove, String computerMove) {
        if(playerMove.equals(computerMove)) {
            return 0;
        }
        switch (playerMove) {
            case "Rock" :
                return (computerMove.equals("Scissors") ? 1 : -1);
            case "Paper" :
                return (computerMove.equals("Rock") ? 1 : -1);
            case "Scissors" :
                return (computerMove.equals("Paper") ? 1 : -1);
        }
        return 0;
    }

    public static String getWinner(int result) {
        switch (result) {
            case 0 :
                return "Its a draw!";
            case 1 :
                return "You Won! You beat the Machine! TAKE THAT SKYNET!";
            case -1 :
                return "You got beat! you mug! GTF!";
        }
        return "";
    }
}
