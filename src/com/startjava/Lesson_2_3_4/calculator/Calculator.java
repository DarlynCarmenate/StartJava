package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        int result = 1;
        switch (sign) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            case '^' :
                for (int i = b; i > 0; i--) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Wrong sign");
                return;
        }
        System.out.print(a + "" + sign + "" + b + "=" + result);
    }
}