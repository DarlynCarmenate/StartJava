package com.startjava.Lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;

    private static final int ROUNDS = 3;

    Random random = new Random();

    private int num;

    private int currentPlayer = 0;

    public GuessNumber(Player... player) {
        players = player;
        castLots();
    }

    public void start() {
        int index = 0;
        Random rnd = new Random();
        int targetNum = rnd.nextInt(100) + 1;
        while (index < ROUNDS) {
            while (true) {
                num = numRequest();
                if (num == 0) continue;
                if (compareNums(num, targetNum) == 0) break;
                if (players[currentPlayer].getAttempts() == 10) {
                    System.out.println(players[currentPlayer].getName() + ", you've run out your attempts");
                }
                currentPlayer = currentPlayer < 2 ? ++currentPlayer : 0;
            }
            System.out.println(players[currentPlayer].getName() + " guessed right the number " + num + " on " +
                    players[currentPlayer].getAttempts() + " attempts");
            players[currentPlayer].setNumOfVictories(1);

            for (Player player : players) {
                printEnteredNums(player);
                player.clearAttempts();
            }
            index++;
        }
        printWinner(findWinner(players));
    }

    private int numRequest() {
        Scanner scn = new Scanner(System.in);
        System.out.println(players[currentPlayer].getName() + ", input a number");
        num = scn.nextInt();
        if (!players[currentPlayer].addNum(num)) {
            System.out.println("Invalid data. Number > 0 and < 101 needed");
            return 0;
        }
        return num;
    }

    private int compareNums(int num, int targetNum) {
        if (num == targetNum) {
            return 0;
        }
        System.out.printf("The number %d is %s than the target number\n", num, num > targetNum ? "greater" : "less");
        return 1;
    }

    private void castLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
    }

    private void printEnteredNums(Player pl) {
        int[] nums = pl.getEnteredNums();
        System.out.print(pl.getName() + "'s attempts: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private int findWinner(Player[] players){
        int max = 0;
        if (players[max].getNumOfVictories() < players[1].getNumOfVictories())  max = 1;
        if (players[max].getNumOfVictories() < players[2].getNumOfVictories())  max = 2;
        return max;
    }

    private void printWinner(int max) {
        if (players[max].getNumOfVictories() == 1) {
            System.out.println("There's no winner");
        } else {
            System.out.println("Player " + players[max].getName() + " is a winner");
        }
    }
}