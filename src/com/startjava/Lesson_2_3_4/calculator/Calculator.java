package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String expression) {
        String[] splittedExpr = expression.split(" ");
        int a = Integer.parseInt(splittedExpr[0]);
        int b = Integer.parseInt(splittedExpr[2]);
        String sign = splittedExpr[1];
        switch (sign) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            case "^":
                return (int) Math.pow(a, b);
            default:
                System.out.println("Wrong parameters");
                return 0;
        }
    }
}