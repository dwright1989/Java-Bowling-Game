package com.techreturners;

public class BowlingGame {

    private int score = 0;
    public int getGameScore(int[][] rolls){
        for (int i=0; i<10; i++) {
            if(rolls[i][0]==10){ // STRIKE
                // If next is a strike/i[1] is 0 then get next roll score to add
                int firstRoll = rolls[i+1][0];
                int secondRoll = 0;
                if(firstRoll==10 && i<9){ // Check it isn't the last frame
                    secondRoll = rolls[i+2][0];
                }else{
                     secondRoll = rolls[i+1][1];
                }
                score+= 10+ firstRoll + secondRoll;
            }
            else if((rolls[i][0]+rolls[i][1])==10){ // SPARE
                score+=rolls[i][0] + rolls[i][1] + rolls[i+1][0];
            }else{
                score += rolls[i][0] + rolls[i][1];
            }
        }
        return score;
    }
}
