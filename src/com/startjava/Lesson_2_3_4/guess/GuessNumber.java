package com.startjava.Lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player[] gamers;

    int[] winners;
    Random random = new Random();

    public GuessNumber(Player... player) {
        gamers = new Player[player.length];
        winners = new int[player.length];
        for (int i = 0; i < player.length; i++) {
            gamers[i] = player[i];
        }
        for (int i = player.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = gamers[j];
            gamers[j] = gamers[i];
            gamers[i] = temp;
        }
    }

    public void start() {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int targetNum = rnd.nextInt(100) + 1;
        int num = 0;
        int currentPlayer = 0;

        while (true) {
            System.out.println(gamers[currentPlayer].getName() + ", input a number");
            num = scn.nextInt();
            if (!gamers[currentPlayer].addNum(num)) {
                System.out.println("Invalid data. Number > 0 and < 101 needed");
                continue;
            }
            if (num == targetNum) {
                break;
            }
            System.out.printf("The number %d is %s than the target number\n", num, num > targetNum ? "greater" : "less");
            if (gamers[currentPlayer].getAttempts() == 10) {
                System.out.println(gamers[currentPlayer].getName() + ", you've run out your attempts");
            }
            currentPlayer = currentPlayer < 2 ? ++currentPlayer : 0;
        }
        System.out.println(gamers[currentPlayer].getName() + " guessed right the number " + num + " on " +
                gamers[currentPlayer].getAttempts() + " attempts");
        winners[currentPlayer]++;

        for (int i = 0; i < GuessNumberTest.len; i++) {
            printEnteredNums(gamers[i]);
            gamers[i].clearAttempts();
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

    public void printWinner() {
        Arrays.sort(winners);
        if (winners[winners.length - 1] == 1) {
            System.out.println("There's no winner");
        } else {
            System.out.println("Player" + gamers[winners.length - 1].getName() + "is a winner");
        }
    }
}