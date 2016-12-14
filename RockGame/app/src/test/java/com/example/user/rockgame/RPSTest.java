package com.example.user.rockgame;
import org.junit.*;
import org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 14/12/2016.
 */
public class RPSTest {

    RPS game;

    @Before
    public void before() {
        game = new RPS();
    }

    @Test
    public void testGame() {
        String result = game.playGame("Rock", "Scissors");
        assertEquals("You win!", result);
    }

    @Test
    public void testRNG() {
        int[] result = game.fakeComputerInput();
        for (int i = 0; i < result.length; i++){
            assertTrue(0 <= result[i] && result[i] <= 3);
        }

    }
}
