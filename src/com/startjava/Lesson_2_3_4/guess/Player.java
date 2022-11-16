package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts = 0;
    private int[] attemptsPlayer;

    public Player(String name) {

        this.name = name;
        this.attemptsPlayer = new int[10];

    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setNewAttempt(int num) {
        this.attemptsPlayer[this.attempts] = num;
        this.attempts++;
    }

    public void printAttempts() {
        int[] allAttempts = Arrays.copyOf(attemptsPlayer, attempts);
        for (int items : allAttempts) {
            System.out.print(items + " ");
        }
    }

    public void initArray() {
        Arrays.fill(attemptsPlayer, 0);
        attempts = 0;
    }
}