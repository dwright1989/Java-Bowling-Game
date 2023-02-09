package com.techreturners;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BowlingGameTest {

    @Test
    public void getScoreForZeros(){
        int[][] rolls = {{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}};
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.getGameScore(rolls));

    }

    @Test
    public void getScoreForOnes(){
        int[][] rolls = {{1,1}, {1,1}, {1,1}, {1,1}, {1,1}, {1,1}, {1,1}, {1,1}, {1,1}, {1,1}};
        BowlingGame game = new BowlingGame();
        assertEquals(20, game.getGameScore(rolls));

    }

}
