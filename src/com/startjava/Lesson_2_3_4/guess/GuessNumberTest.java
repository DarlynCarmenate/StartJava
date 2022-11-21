package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static final int len = 3;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi! Let's start. Each player has 10 attempts");
        Player[] players = new Player[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Please, enter your name: ");
            String name = scn.nextLine();
            players[i] = new Player(name);
        }
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                GuessNumber game = new GuessNumber(players);
                for (int i = 0; i < 3; i++) {
                    game.start();
                }
                game.printWinner();
            }
            System.out.println("Do you want to play again?");
            answer = scn.nextLine();
        } while (!"no".equals(answer));
    }
}