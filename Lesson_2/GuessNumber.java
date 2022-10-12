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
        int myNum = 0;
        String flag = "player1";
        String currentPlayer = player1.getName();

        while (targetNum != myNum) {
            System.out.println(currentPlayer + ", input a number");
            myNum = scn.nextInt();
            player1.setNumber(myNum);
            currentPlayer = player2.getName();
            if (targetNum < myNum) {
                System.out.println("The number " + myNum + " is greater than the target number");
            } else if (targetNum > myNum) {
                System.out.println("The number " + myNum + " is less than the target number");
            }

            System.out.println(currentPlayer + ", input a number");
            myNum = scn.nextInt();
            player2.setNumber(myNum);
            currentPlayer = player1.getName();
            if (targetNum < myNum) {
                System.out.println("The number " + myNum + " is greater than the target number");
            } else if (targetNum > myNum) {
                System.out.println("The number " + myNum + " is less than the target number");
            }
        }
        System.out.println("You guessed right! I picked number " + myNum);
    }
}