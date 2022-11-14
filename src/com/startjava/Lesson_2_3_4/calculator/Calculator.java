package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private String sign;

    public int calculate(String expression) {
        String[] splittedExpr = expression.split(" ");
        a = Integer.parseInt(splittedExpr[0]);
        b = Integer.parseInt(splittedExpr[2]);
        sign = splittedExpr[1];
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
                return -111;
        }
    }
}