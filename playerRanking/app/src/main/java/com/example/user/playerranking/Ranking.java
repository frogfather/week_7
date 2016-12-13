package com.example.user.playerranking;

import java.util.*;


/**
 * Created by user on 12/12/2016.
 */
public class Ranking {
   private ArrayList<Player> rankings;

    public Ranking(){
        rankings = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        if (rankings.size()< 10) {
            player.setRanking(rankings.size()+1);
            player.setChanged(false);
            rankings.add(player);
        }
        else{
            player.setRanking(10);
            rankings.set(9,player);
        }
     // printRankings();
    }

    public Player getPlayerByRanking(int rank){
        return rankings.get(rank-1);
    }

    public int playerCount(){
        return rankings.size();
    }

    public Player getPlayerByName(String name){
        Player playerfound = null;
        for (Player player: rankings){
            if (player.getName().equals(name)){
                playerfound = player;
            }
        }
        return playerfound;
    }

    public void reorder(){
        //looks for a changed item and moves it to the correct slot. Re-ranks all between
        //the place the changed item came from and where it's moved to
        int counter;
        int toSwap = 0;
        int toSwapRank = 0;
        Player changedPlayer = null;
        Player tempPlayer = null;
        if (rankings.size() > 1) {
            for (Player player: rankings){
                if (player.getChanged()){
                    changedPlayer = player;
                    toSwap = rankings.indexOf(player);
                    toSwapRank = player.getRanking();
                }
            }
            //now find out what's on either side of the changed item
        if (toSwap > 0){
            // the player ranking should = the list position +1
            if (toSwapRank > toSwap+1) {
                //move it down the rankings by (toSwap - toSwapRank +1)
                for (counter = toSwap + 1; counter< toSwapRank; counter++) {
                    //move the previous player down one and update their ranking
                    tempPlayer = rankings.get(counter);
                    tempPlayer.setRanking(counter);
                    rankings.set(counter-1,tempPlayer);
                    }

                }
            else if (toSwapRank < toSwap+1) {
                //move it up the rankings
                for (counter = toSwap - 1; counter>= toSwapRank -1 ; counter--) {
                    //move the previous player down one and update their ranking
                    tempPlayer = rankings.get(counter);
                    tempPlayer.setRanking(counter+2);
                    tempPlayer.setChanged(false);
                    rankings.set(counter+1,tempPlayer);
                    }
                }
            changedPlayer.setChanged(false);
            rankings.set(toSwapRank-1,changedPlayer);

            }
        }
    }
    public void printRankings(){
        if (rankings.size() > 0){
            System.out.println(" ");
            for (Player player: rankings){
            System.out.println(player.toString());
            }
        }
    }

}
