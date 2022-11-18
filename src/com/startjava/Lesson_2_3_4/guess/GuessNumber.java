package com.startjava.Lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player member1, Player member2) {
        player1 = member1;
        player2 = member2;
    }

    public void start() {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int targetNum = rnd.nextInt(100) + 1;
        int num = 0;
        Player currentPlayer = player1;

        while (true) {
            System.out.println(currentPlayer.getName() + ", input a number");
            num = scn.nextInt();
            currentPlayer.addNum(num);
            if (num == targetNum) {
                break;
            }
            if (num > targetNum) {
                System.out.println("The number " + num + " is greater than the target number");
            } else if (num < targetNum) {
                System.out.println("The number " + num + " is less than the target number");
            }
            if (currentPlayer.getAttempts() == 10) {
                System.out.println(currentPlayer.getName() + ", you've run out your attempts");
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        System.out.println(currentPlayer.getName() + " guessed right the number " + num + " on " +
                currentPlayer.getAttempts() + " attempts");

        printEnteredNums(player1);
        printEnteredNums(player2);
        player1.clearAttempts();
        player2.clearAttempts();
    }

    public void printEnteredNums(Player pl) {
        int[] arr = pl.getEnteredNums();
        System.out.print(pl.getName() + "'s attempts: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}