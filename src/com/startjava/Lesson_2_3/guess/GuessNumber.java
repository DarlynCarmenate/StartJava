package src.com.startjava.Lesson_2_3.guess;

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

        while (targetNum != num) {
            System.out.println(currentPlayer.getName() + ", input a number");
            num = scn.nextInt();
            currentPlayer.setNumber(num);
            if (currentPlayer.getNumber() > targetNum) {
                System.out.println("The number " + currentPlayer.getNumber() + " is greater than the target number");
            } else if (currentPlayer.getNumber() > targetNum) {
                System.out.println("The number " + currentPlayer.getNumber() + " is less than the target number");
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        System.out.println("You guessed right! I picked number " + num);
    }
}