package com.example.user.playerranking;

/**
 * Created by user on 12/12/2016.
 */
public class Player {

    private String name;
    private String nickname;
    private int ranking;
    private boolean changed;

    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
        this.ranking = 0;
        this.changed = false;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
        setChanged(true);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setChanged(boolean changed){
        this.changed = changed;
    }

    public int getRanking(){
        return this.ranking;
    }

    public String getName(){
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }

    public boolean getChanged(){
        return this.changed;
    }

    public String toString(){
        return "Name: "+name+", Nickname: "+nickname+", Ranking: "+ranking+" Changed: "+changed;
    }
}
