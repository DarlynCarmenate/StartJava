package com.startjava.Lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter < 22);
        System.out.println("In interval [-10;21] the sum of even numbers is: " + sumEven +
                ", the sum of odd numbers is: " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > max) {
            max = num2;
        }
        else if (num3 > max) {
            max = num3;
        } 
        if (num1 < min) {
            min = num1;
        }
        else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        int digit = 0;
        while (srcNum > 0) {
            digit = srcNum % 10;
            sum += digit;
            System.out.print(digit);
            srcNum /= 10;
        } 
        System.out.println("\nThe sum of number's digits is: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int numsInRow = 5;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%1$3d  ", i);
            count++;
            if (count % numsInRow == 0) {
                System.out.println();
            }
        }
        int zeroAmount = numsInRow - count % numsInRow;
        for (int i = 1; i <= zeroAmount; i++) {
            System.out.printf("%1$3d  ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int copySrcNum = srcNum;
        count = 0;
        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 1) {
                count++;
            }
            copySrcNum /= 10;
        }
        if (count % 2 == 0) {
            System.out.printf("Number %d contains %d (even number) ones", srcNum, count);
        } else {
            System.out.printf("Number %d contains %d (odd number) ones %n", srcNum, count);
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        int row = 5;
        int elements = 5;
        while (row > 0) {
            System.out.println();
            int i = elements;
            while (i > 0) {
                System.out.print("#");
                i--;
            }
            elements--;
            row--;
        }
        System.out.println("\n");

        row = 0;
        count = 0;
        do {
            elements = 0;
            do {
               System.out.print("$");
            } while (++elements <= row);
            if (++count <= 2) {
                row++;
            } else {
                row--;
            }
            System.out.println();
        } while (row >= 0);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("Dec   Char");
        for (char i = 1; i < 47; i += 2) {
            System.out.printf("%3d  -  %2c%n", (int) i, i);
        }
        for (char i = 98; i < 122; i += 2) {
            System.out.printf("%3d  -  %2c%n", (int) i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int lastDigit = 0;
        int reverse = 0;
        while (copySrcNum > 0) {
            lastDigit = copySrcNum % 10;
            reverse = reverse * 10 + lastDigit;
            copySrcNum /= 10;
        }
        if (srcNum == reverse) {
            System.out.printf("The number %d is a palindrome", srcNum);
        } else {
            System.out.printf("The number %d is not a palindrome", srcNum);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        srcNum = 345432;
        int firstPart = srcNum / 1000;
        int secondPart = srcNum % 1000;
        int numLength = 6;
        int sum1 = 0;
        int sum2 = 0;
        count = 0;
        while (srcNum > 0) {
            count++;
            if (count <= numLength / 2) {
                sum2 += srcNum % 10;
            } else {
                sum1 += srcNum % 10;
            }
            srcNum /= 10;
        }
        System.out.printf("The sum of %d digits is: %d%n", firstPart, sum1);
        System.out.printf("The sum of %d digits is: %d%n", secondPart, sum2);
        if (sum1 == sum2) {
            System.out.println("The number is lucky!");
        } else {
            System.out.println("The number isn't lucky");
        }  

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("        ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf(" %d ", i);
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            System.out.print("____");
        }
        
        for (int i = 2; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <=9; j++) {
                if (j == 1) {
                    System.out.printf("%2d |", i * j);
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
        }
    }
}