package com.startjava.Lesson_1.fin;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            int tempB = b;
            for (result = 1; tempB > 0; tempB--) {
                result *= a;
            }
        }
        System.out.print(a + "" + sign + "" + b + "=" + result);
    }
}