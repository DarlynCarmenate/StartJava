package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Input the first number: ");
            int num1 = scanner.nextInt();
            calc.setA(num1);
            System.out.print("Input the sign: ");
            char sign = scanner.next().charAt(0);
            calc.setSign(sign);
            System.out.print("Input the second number: ");
            int num2 = scanner.nextInt();
            calc.setB(num2);
            scanner.nextLine();

            calc.calculate();

            System.out.println("\nWould you like to continue? Input yes or no");
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Wrong answer. Input yes or no");
                answer = scanner.nextLine();
            } 
        } while (answer.equals("yes"));
    } 
}