package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(true,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highscore = calculateScore(true,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highscore);

        System.out.println("==============================");

        displayHighShcorePosition("Mark",calculateHighScorePosition(1500));
        displayHighShcorePosition("Joanna",calculateHighScorePosition(900));
        displayHighShcorePosition("Anna",calculateHighScorePosition(400));
        displayHighShcorePosition("Bartek",calculateHighScorePosition(50));
        displayHighShcorePosition("Malwina",calculateHighScorePosition(500));



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else {
            return -1;
        }

    }

    public static void displayHighShcorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score > 1000) {
            return 1;
        }else if((score > 500) && (score <= 1000)) {
            return 2;
        }else if((score > 100) && (score <= 500)) {
            return 3;
        } else {
            return 4;
        }
    }


}
