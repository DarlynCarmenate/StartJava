package com.startjava.Lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player[] players;

    Random random = new Random();

    public GuessNumber(Player... player) {
        players = player;
        castLots();
    }

    public void start() {
        int rounds = 0;
        while (rounds < 3) {
            Random rnd = new Random();
            Scanner scn = new Scanner(System.in);
            int targetNum = rnd.nextInt(100) + 1;
            int num;
            int currentPlayer = 0;

            while (true) {
                System.out.println(players[currentPlayer].getName() + ", input a number");
                num = scn.nextInt();
                if (!players[currentPlayer].addNum(num)) {
                    System.out.println("Invalid data. Number > 0 and < 101 needed");
                    continue;
                }
                if (num == targetNum) {
                    break;
                }
                System.out.printf("The number %d is %s than the target number\n", num, num > targetNum ? "greater" : "less");
                if (players[currentPlayer].getAttempts() == 10) {
                    System.out.println(players[currentPlayer].getName() + ", you've run out your attempts");
                }
                currentPlayer = currentPlayer < 2 ? ++currentPlayer : 0;
            }
            System.out.println(players[currentPlayer].getName() + " guessed right the number " + num + " on " +
                    players[currentPlayer].getAttempts() + " attempts");
            players[currentPlayer].setWinner(1);

            for (Player player : players) {
                printEnteredNums(player);
                player.clearAttempts();
            }
            rounds++;
        }
        printWinner(findWinner(players));
    }

    public void castLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
    }

    public void printEnteredNums(Player pl) {
        int[] nums = pl.getEnteredNums();
        System.out.print(pl.getName() + "'s attempts: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int findWinner(Player[] players){
        int max = 0;
        if (players[max].getWinner() < players[1].getWinner())  max = 1;
        if (players[max].getWinner() < players[2].getWinner())  max = 2;
        return max;
    }
    public void printWinner(int max) {
        if (players[max].getWinner() == 1) {
            System.out.println("There's no winner");
        } else {
            System.out.println("Player " + players[max].getName() + " is a winner");
        }
    }
}