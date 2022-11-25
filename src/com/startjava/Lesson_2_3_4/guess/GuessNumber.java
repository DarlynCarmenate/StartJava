package com.startjava.Lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;

    private static final int ROUNDS = 3;

    Random random = new Random();

    private int num;

    private int currentPlayer;

    public GuessNumber(Player... player) {
        players = player;
    }

    public void start() {
        int round = 1;
        Random rnd = new Random();
        int targetNum = rnd.nextInt(100) + 1;
        castLots();
        while (round <= ROUNDS) {
            while (true) {
                num = inputNums();
                if (num == 0) continue;
                if (compareNums(num, targetNum)) break;
                if (players[currentPlayer].getAttempts() == 10) {
                    System.out.println(players[currentPlayer].getName() + ", you've run out your attempts");
                }
                currentPlayer = currentPlayer < 2 ? ++currentPlayer : 0;
            }
            System.out.println(players[currentPlayer].getName() + " guessed right the number " + num + " on " +
                    players[currentPlayer].getAttempts() + " attempts");
            players[currentPlayer].setNumWins(1);

            for (Player player : players) {
                printEnteredNums(player);
                player.clearAttempts();
            }
            round++;
        }
        printWinner(players);
    }

    private int inputNums() {
        Scanner scn = new Scanner(System.in);
        System.out.println(players[currentPlayer].getName() + ", input a number");
        num = scn.nextInt();
        if (!players[currentPlayer].addNum(num)) {
            System.out.println("Invalid data. Number > 0 and < 101 needed");
            return 0;
        }
        return num;
    }

    private boolean compareNums(int num, int targetNum) {
        if (num == targetNum) {
            return true;
        }
        System.out.printf("The number %d is %s than the target number\n",
                num, num > targetNum ? "greater" : "less");
        return false;
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
        if (players[max].getNumWins() < players[1].getNumWins())  max = 1;
        if (players[max].getNumWins() < players[2].getNumWins())  max = 2;
        return max;
    }

    private void printWinner(Player[] players) {
        int max = findWinner(players);
        if (players[max].getNumWins() == 1) {
            System.out.println("There's no winner");
        } else {
            System.out.println("Player " + players[max].getName() + " is a winner");
        }
    }
}