package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Input a mathematical expression: ");
            String expression = scanner.nextLine();
            String[] splittedExpr = expression.split(" ");
            int num1 = Integer.parseInt(splittedExpr[0]);
            calc.setA(num1);
            int num2 = Integer.parseInt(splittedExpr[2]);
            calc.setB(num2);
            calc.setSign(splittedExpr[1]);

            System.out.println(num1 + splittedExpr[1] + num2 + " = " + calc.calculate());

            System.out.print("\nWould you like to continue? Input yes or no: ");
            answer = scanner.nextLine();
            while (!"yes".equals(answer) && !"no".equals(answer)) {
                System.out.println("Wrong answer. Input yes or no: ");
                answer = scanner.nextLine();
            } 
        } while (answer.equals("yes"));
    } 
}