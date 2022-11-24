package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final int CAPACITY = 3;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Player[] players = createPlayers();

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                GuessNumber game = new GuessNumber(players);
                game.start();
            }
            System.out.println("Do you want to play again?");
            answer = scn.nextLine();
        } while (!"no".equals(answer));
    }

    private static Player[] createPlayers() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi! Let's start. Each player has 10 attempts");
        Player[] pls = new Player[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            System.out.print("Please, enter your name: ");
            pls[i] = new Player(scn.nextLine());
        }
        return pls;
    }
}