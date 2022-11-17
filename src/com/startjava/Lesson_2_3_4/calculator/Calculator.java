package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public static class NegativeValueException extends RuntimeException {

    }
    public static int calculate(String expression) throws NegativeValueException {
        String[] splittedExpr = expression.split(" ");
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(splittedExpr[0]);
            b = Integer.parseInt(splittedExpr[2]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong data. Please, enter an integer expression ");
            return 0;
        }
        if (a < 0 || b < 0) {
            throw new NegativeValueException();
            //throw new RuntimeException("YYYY");
        }

        String sign = splittedExpr[1];

        int result = switch (sign) {
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
        return result;
    }
}