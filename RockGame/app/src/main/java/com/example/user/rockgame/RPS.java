package com.example.user.rockgame;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by user on 14/12/2016.
 */
public class RPS {
    public RPS() {
    }

    public String playGame(String playerInput, String computerInput) {
        String youWin = "You win!";
        String youLose = "You lose!";
        String draw = "It's a draw!";
        if (playerInput == computerInput){
            return draw;}
        else if (playerInput == "Rock" && computerInput == "Scissors"){
            return youWin;}
        else if (playerInput == "Rock" && computerInput == "Paper"){
            return youLose;}
        else if (playerInput == "Paper" && computerInput == "Scissors"){
            return youLose;}
        else if (playerInput == "Paper" && computerInput == "Rock"){
            return youWin;}
        else if (playerInput == "Scissors" && computerInput == "Paper"){
            return youWin;}
        else if (playerInput == "Scissors" && computerInput == "Rock"){
            return youLose;}
        else return null;
    }
    public String computerInput() {
        Random rand = new Random();
        int num = rand.nextInt(3) + 1;
        if (num == 1) return "Rock";
        if (num == 2) return "Paper";
        if (num == 3) return "Scissors";
        else return null;
    }

    public int[] fakeComputerInput() {
        int [] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 9; i++) {
            int num = rand.nextInt(3) + 1;
            array[i] = num;}
        return array;
        }
    }