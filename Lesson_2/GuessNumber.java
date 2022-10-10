import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player member1, Player member2) {
        player1 = member1;
        player2 = member2;
    }

    public void gameProcess() {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int targetNum = rnd.nextInt(100) + 1;
        int myNum = 0;
        String flag = "player1";

        while (targetNum != myNum) {
            if (flag == "player1") {
                System.out.println(player1.getName() + ", input a number");
                myNum = scn.nextInt();
                player1.setNumber(myNum);
                flag = "player2";
            } else {
                System.out.println(player2.getName() + ", input a number");
                myNum = scn.nextInt();
                player2.setNumber(myNum);
                flag = "player1";
            }
            if (targetNum < myNum) {
                System.out.println("The number " + myNum + " is greater than the target number");
            } else if (targetNum > myNum) {
                System.out.println("The number " + myNum + " is less than the target number");
            }
        }
        System.out.println("You guessed right! I picked number " + myNum);
    }
}