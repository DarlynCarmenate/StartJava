public class Calculator {
    private int a;
    private int b;
    private char sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate(int a, int b, char sign) {
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
        }
        System.out.print(a + "" + sign + "" + b + "=" + result);
    }
}