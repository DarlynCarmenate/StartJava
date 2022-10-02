import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
            Calculator calc = new Calculator();
            Scanner scanner = new Scanner(System.in);
            String answer = "yes";
        do {
            System.out.print("Input the first number: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input the sign: ");
            char sign = scanner.next().charAt(0);
            System.out.print("Input the second number: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

                calc.setA(num1);
                calc.setB(num2);
                calc.setSign(sign);

            calc.calculate(num1, num2, sign);

            System.out.println("\nWould you like to make another count? Input yes or no");
            answer = scanner.nextLine();
            System.out.println(answer);
        } while (answer == "yes");
    }
}