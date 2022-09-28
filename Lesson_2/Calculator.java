
public class Calculator {
    int a;
    int b;
    char sign;

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

    public void calcCount(int a, int b, char sign) {
        int result = 0;
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
                int tempB = b;
                for (result = 1; tempB > 0; tempB--) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Wrong sign");
            }
        System.out.print(a + "" + sign + "" + b + "=" + result);
        }
    }