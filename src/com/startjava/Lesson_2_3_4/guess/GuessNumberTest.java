package com.startjava.Lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hi! Let's start. Each player has 10 attempts");
        System.out.print("Player 1, enter your name: ");
        String name1 = scn.nextLine();
        System.out.print("Player 2, enter your name: ");
        String name2 = scn.nextLine();
        Player pl1 = new Player(name1);
        Player pl2 = new Player(name2);
        GuessNumber game = new GuessNumber(pl1, pl2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.println("Do you want to play again?");
            answer = scn.nextLine();
        } while (!"no".equals(answer));
    }
}