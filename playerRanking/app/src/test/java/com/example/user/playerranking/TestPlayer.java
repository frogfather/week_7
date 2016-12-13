package com.example.user.playerranking;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class TestPlayer {

    Player player;

    @Before
    public void before(){
        player = new Player("Gary Anderson","The Flying Scotsman");
    }

    @Test
    public void setupTest(){
        assertEquals("Gary Anderson", player.getName());
        assertEquals("The Flying Scotsman", player.getNickname());
        assertEquals(0, player.getRanking());
    }

    @Test
    public void setNameTest(){
        player.setName("John Smith");
        assertEquals("John Smith", player.getName());
    }

    @Test
    public void setNicknameTest(){
        player.setNickname("Fat git");
        assertEquals("Fat git", player.getNickname());
    }

    @Test
    public void setRankingTest(){
        player.setRanking(5);
        assertEquals(5, player.getRanking());
    }

    @Test
    public void toStringTest(){
        assertEquals("Name: Gary Anderson, Nickname: The Flying Scotsman, Ranking: 0", player.toString());
    }
}
