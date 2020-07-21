package com.company;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score , levelCompleted ,bonus );
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score , levelCompleted ,bonus );
        System.out.println("Your final score was " + highScore);

        String playerName;
        int playerScore = 1500;
        int positionInTable = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName = "Michal" , positionInTable);
        playerScore = 900;
        positionInTable = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName = "Fanklin" , positionInTable);
        playerScore = 400;
        positionInTable = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName = "Ola" , positionInTable);
        playerScore = 50;
        positionInTable = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName = "Zuzia" , positionInTable);
        playerScore = 1000;
        positionInTable = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName = "Luiz" , positionInTable);


    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score +(levelCompleted * bonus);
            finalScore +=2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionInTable){
        System.out.println(playerName + " managed to get position into position " + positionInTable + " on the high score table.");


    }
    public static  int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500 ) {
            position = 2;
        }
        else if(playerScore >= 100 );
        {
            position = 3;
        }
            return position;

    }



}
