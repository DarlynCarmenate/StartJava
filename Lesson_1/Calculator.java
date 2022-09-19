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
            result = 1;
            int tempB = b;
            while (tempB > 0) {
                result = result * a;
                tempB--;
            }
        }
        System.out.print(a + "" + sign + "" + b + "=" + result);
    }
}