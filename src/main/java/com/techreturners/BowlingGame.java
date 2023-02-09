package com.techreturners;

public class BowlingGame {

    private int score = 0;
    public int getGameScore(int[][] rolls){
        for (int[] roll : rolls) {
            score += roll[0] + roll[1];
        }
        return score;
    }
}
