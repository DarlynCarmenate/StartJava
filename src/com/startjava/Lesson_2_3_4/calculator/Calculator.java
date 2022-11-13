package com.startjava.Lesson_2_3_4.calculator;

import static java.lang.Math.pow;

public class Calculator {
    private int a;
    private int b;
    private String sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int calculate() {
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
                result = (int) pow(a, b);
                break;
            default:
                System.out.println("Wrong sign");
                return 0;
        }
        return result;
    }
}