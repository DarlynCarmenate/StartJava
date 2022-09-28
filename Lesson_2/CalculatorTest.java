import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        calc.setA(scanner.nextInt());
        System.out.print("Input the first number: ");
        calc.setB(scanner.nextInt());
        System.out.print("Input the sign: ");
        calc.setSign(scanner.next().charAt(0));

        int numA = calc.getA();
        int numB = calc.getB();
        char signC = calc.getSign();

        calc.calcCount(numA, numB, signC);
    }
}