package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Input a mathematical expression: ");
                String expression = scanner.nextLine();
                System.out.println(calc.calculate(expression));
            }
            System.out.print("\nWould you like to continue? Input yes or no: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    } 
}