package com.example.user.playerranking;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class TestRanking {

    Ranking ranking;
    Player player1, player2, player3, player4, player5, player6, player7, player8, player9, player10;

    @Before
    public void before(){
        ranking = new Ranking();
        player1 = new Player("One", "Apple");
        player2 = new Player("Two", "Pear");
        player3 = new Player("Three", "Grapefruit");
        player4 = new Player("Four", "Lemon");
        player5 = new Player("Five", "Kumquat");
        player6 = new Player("Six", "Tangerine");
        player7 = new Player("Seven", "Bergamot");
        player8 = new Player("Eight", "Lime");
        player9 = new Player("Nine", "Nectarine");
        player10 = new Player("Ten", "Pineapple");
        ranking.addPlayer(player1);
        ranking.addPlayer(player2);
        ranking.addPlayer(player3);
        ranking.addPlayer(player4);
        ranking.addPlayer(player5);
        ranking.addPlayer(player6);
        ranking.addPlayer(player7);
        ranking.addPlayer(player8);
        ranking.addPlayer(player9);
        ranking.addPlayer(player10);

    }

    @Test
    public void testAddPlayer(){

        ranking.printRankings();

        Player test = ranking.getPlayerByRanking(5); // item 4 in the list name Five ranked 5
        assertEquals("Five",test.getName());

        test.setRanking(2);
        test = ranking.getPlayerByRanking(5);
        assertEquals(2,test.getRanking()); //item with name "Five" now has rank 2

        ranking.printRankings();

        ranking.reorder();
        test = ranking.getPlayerByRanking(5); //item Five has moved to position 2. 2,3,4 have moved to 3,4,5
        assertEquals("Four", test.getName()); //player "Four" is now ranking 5

        ranking.printRankings();

        test = ranking.getPlayerByRanking(2); //this is item with name "Five"
        assertEquals("Five", test.getName());

        test.setRanking(5); //set his ranking back to 5

        ranking.printRankings();

        ranking.reorder();

        test = ranking.getPlayerByRanking(2);
        assertEquals("Two",test.getName());

        ranking.printRankings();
    }

    @Test
    public void testGetByName(){
        assertEquals(player5,ranking.getPlayerByName("Five"));
    }

}
