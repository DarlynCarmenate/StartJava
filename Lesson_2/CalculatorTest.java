import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
        System.out.print("Input the first number: ");
        int inputA = scanner.nextInt();
        System.out.print("Input the sign: ");
        char inputSign = scanner.next().charAt(0);
        System.out.print("Input the second number: ");
        int inputB = scanner.nextInt();

        while (inputA <= 0 || inputB <= 0) {
            System.out.println("Input positive numbers, please!");
            System.out.print("Input the first number: ");
            inputA = scanner.nextInt();
            System.out.print("Input the second number: ");
            inputB = scanner.nextInt();
        }

            calc.setA(inputA);
            calc.setB(inputB);
            calc.setSign(inputSign);

        int numA = calc.getA();
        int numB = calc.getB();
        char signC = calc.getSign();

        calc.calculate(numA, numB, signC);

        System.out.println("\nWould you like to make another count? Input yes or no");
        String answer = scanner.next();

        } while (answer == "yes");
    }
}