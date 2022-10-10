import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Player 1, enter your name");
        String name1 = scn.nextLine();
        System.out.println("Player 2, enter your name");
        String name2 = scn.nextLine();
        Player member1 = new Player(name1);
        Player member2 = new Player(name2);
        GuessNumber game = new GuessNumber(member1, member2);
        String answer;

        do {
            game.gameProcess();
            System.out.println("Do you want to play again?");
            answer = scn.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Do you want to play again?");
                answer = scn.nextLine();
            }
        } while (answer.equals("yes"));
    }
}