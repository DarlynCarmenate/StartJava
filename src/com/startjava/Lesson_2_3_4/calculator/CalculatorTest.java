package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                while (true) {
                    System.out.print("Input a mathematical expression: ");
                    String expression = scanner.nextLine();
                    try {
                        System.out.println(Calculator.calculate(expression));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong data. Please, enter an integer expression ");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Numbers can't be negative. Input correct data");
                    }
                }
            }
            System.out.print("\nWould you like to continue? Input yes or no: ");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    } 
}