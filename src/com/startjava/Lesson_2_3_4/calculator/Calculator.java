package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        String[] splittedExpr = expression.split(" ");
        int a, b;
        a = Integer.parseInt(splittedExpr[0]);
        b = Integer.parseInt(splittedExpr[2]);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }

        String sign = splittedExpr[1];

        return switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            case "^" -> (int) Math.pow(a, b);
            default -> {
                System.out.println("Wrong parameters");
                yield 0;
            }
        };
    }
}