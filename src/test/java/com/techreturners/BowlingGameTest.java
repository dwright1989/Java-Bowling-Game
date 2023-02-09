package com.techreturners;

import org.junit.Ignore;
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

    @Test
    public void getScoreForRandomRollsWithoutStrikeOrSpare(){
        int[][] rolls = {{0,3}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,0}, {3,6}};
        BowlingGame game = new BowlingGame();
        assertEquals(69, game.getGameScore(rolls));

    }

    @Test
    public void getScoreForRollsWithSpareAtStart(){
        int[][] rolls = {{5,5}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,0}, {3,6}};
        BowlingGame game = new BowlingGame();
        assertEquals(77, game.getGameScore(rolls));
    }

    @Test
    public void getScoreForRollsWithSpareAtEnd(){
        int[][] rolls = {{5,1}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,0}, {3,7}, {6}};
        BowlingGame game = new BowlingGame();
        assertEquals(79, game.getGameScore(rolls));
    }

    @Test
    public void getScoreForRollsWithTwoConsecutiveSpares(){
        int[][] rolls = {{5,1}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,3}, {3,7}, {6}};
        BowlingGame game = new BowlingGame();
        assertEquals(85, game.getGameScore(rolls));
    }
    @Test
    public void getScoreForRollsWithStrikeAtStart(){
        int[][] rolls = {{10,0}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,1}, {3,1}};
        BowlingGame game = new BowlingGame();
        assertEquals(80, game.getGameScore(rolls));
    }

    @Test
    public void getScoreForRollsWithStrikeAtEnd(){
        int[][] rolls = {{3,0}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {7,1}, {10,0}, {2,4}};
        BowlingGame game = new BowlingGame();
        assertEquals(77, game.getGameScore(rolls));
    }

    @Test
    public void getScoreForRollsWithTwoStrikes(){
        int[][] rolls = {{3,0}, {1,7}, {2,4}, {10,0}, {1,8}, {8,1}, {8,1}, {10,0}, {2,1}, {1,0}};
        BowlingGame game = new BowlingGame();
        assertEquals(80, game.getGameScore(rolls));
    }



    @Ignore
    public void getScoreForRollsWithTwoConsecutiveStrikes(){
        int[][] rolls = {{3,0}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {10,0}, {10,0}, {1,0}};
        BowlingGame game = new BowlingGame();
        assertEquals(85, game.getGameScore(rolls));
    }

    @Ignore
    public void getScoreForRollsWithTwoConsecutiveStrikesAtEnd(){
        int[][] rolls = {{3,0}, {1,7}, {2,4}, {4,4}, {1,8}, {8,1}, {8,1}, {0,1}, {10,0}, {10,0}, {2,4}};
        BowlingGame game = new BowlingGame();
        assertEquals(91, game.getGameScore(rolls));
    }

    @Test
    public void getScoreForAllStrikes(){
        int[][] rolls = {{10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,0}, {10,10}};
        BowlingGame game = new BowlingGame();
        assertEquals(300, game.getGameScore(rolls));
    }

}
