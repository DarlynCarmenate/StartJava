package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNums;

    public Player(String name) {
        this.name = name;
        this.enteredNums = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void addNum(int num) {
        enteredNums[attempts] = num;
        attempts++;
    }

    public int[] printAttempts() {
        int[] allAttempts = Arrays.copyOf(enteredNums, attempts);
        return allAttempts;
    }

    public void clearAttempts() {
        Arrays.fill(enteredNums, 0);
        attempts = 0;
    }
}