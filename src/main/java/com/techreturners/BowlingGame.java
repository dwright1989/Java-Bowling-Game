package com.techreturners;

public class BowlingGame {

    private int score = 0;
    public int getGameScore(int[][] rolls){
        for (int i=0; i<10; i++) {
            if(rolls[i][0]==10){
                score+= 10+rolls[i+1][0] + rolls[i+1][1];
            }
            else if((rolls[i][0]+rolls[i][1])==10){
                score+=rolls[i][0] + rolls[i][1] + rolls[i+1][0];
            }else{
                score += rolls[i][0] + rolls[i][1];
            }
        }
        return score;
    }
}
