package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int attempts;
    private final int[] enteredNums;

    private int numWins;

    public Player(String name) {
        this.name = name;
        enteredNums = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int numWins) {
        this.numWins += numWins;
    }

    public boolean addNum(int num) {
        if (num > 0 && num <= 100) {
            enteredNums[attempts] = num;
            attempts++;
            return true;
        }
        return false;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempts);
    }

    public void clearAttempts() {
        Arrays.fill(enteredNums, 0, attempts,0);
        attempts = 0;
    }
}