package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private String sign;
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String calculate() {
        String[] splittedExpr = expression.split(" ");
        a = Integer.parseInt(splittedExpr[0]);
        b = Integer.parseInt(splittedExpr[2]);
        sign = splittedExpr[1];
        int result = 1;
        switch (sign) {
            case "+" :
                result = a + b;
                break;
            case "-" :
                result = a - b;
                break;
            case "*" :
                result = a * b;
                break;
            case "/" :
                result = a / b;
                break;
            case "%" :
                result = a % b;
                break;
            case "^" :
                result = (int) Math.pow(a, b);
                break;
            default:
                System.out.println("Wrong parameters");
        }
        return a + splittedExpr[1] + b + " = " + result;
    }
}