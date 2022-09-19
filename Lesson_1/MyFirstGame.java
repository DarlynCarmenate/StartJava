public class MyFirstGame {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        int theNumber = 99;
        int myNumber = 50;
        boolean rightNumber = false;

        while (!rightNumber) {
            if (theNumber < myNumber) {
                System.out.println("Число " + myNumber + " больше того, что загадал компьютер");
                to = myNumber;
                myNumber = (from + to) / 2;
            } else if (theNumber > myNumber) {
                System.out.println("Число " + myNumber + " меньше того, что загадал компьютер");
                from = myNumber;
                myNumber = (from + to) / 2;
            } else {
                System.out.println("Вы угадали! Я загадывал " + myNumber);
                rightNumber = true;
            }
        }
    }
}