package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.Lesson_2_3_4.calculator.Calculator.calculate;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Input a mathematical expression: ");
                while (true) {
                    String expression = scanner.nextLine();
                    try {
                        System.out.println(calculate(expression));
                        break;
                    } catch (Calculator.NegativeValueException e) {
                        System.out.println("Numbers can't be negative. Input correct data");
                    }
                }
            }
            System.out.print("\nWould you like to continue? Input yes or no: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    } 
}