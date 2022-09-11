public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int srcNum = -10;
        int oddNums = 0;
        int evenNums = 0;
        do {
            if (srcNum % 2 == 0) {
                evenNums += srcNum;
            } else {
                oddNums += srcNum;
            }
            srcNum++;
        } while(srcNum < 22);
        System.out.println("In interval [-10;21] the sum of even numbers is: " + evenNums +
                ", the sum of odd numbers is: " + oddNums);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if(max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        } 
        if (min > num1) {
            min = num1;
        }
        if (min > num3) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        srcNum = 1234;
        int sum = 0;
        while (srcNum > 0) {
            sum += srcNum % 10;
            System.out.print(srcNum % 10);
            srcNum /= 10;
        } 
        System.out.println("\nThe sum of number's digits is: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int row = 5;
        int intervalEnd = 24;
        for (int i = 1; i < intervalEnd; i+=2) {
            System.out.printf("%1$3d  ", i);
            count += 1;
            if (count % row == 0) {
                System.out.print("\n");
            }
        }
        int zeroAmount = row - count % row;
        for (int i = 1; i <= zeroAmount; i++) {
            System.out.printf("%1$3d  ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        count = 0;
        while (srcNum > 0) {
            if (srcNum % 10 == 1) {
                count ++;
            }
            srcNum /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Number 3141591 contains an even number of ones");
        } else {
            System.out.println("Number 3141591 contains an odd number of ones");
        }
        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }
        row = 5;
        int elements = 5;
        while (row > 0) {
            System.out.print("\n");
            int i = elements;
            while (i > 0) {
                System.out.print("#");
                i--;
            }
            elements -= elements / row;
            row--;
        }
        System.out.print("\n");
        row = 5;
        int half = row / 2;
        elements = 1;
        do {
            System.out.print("\n");
            int i = elements;
            do {
                System.out.print("$");
                i--;
                } while (i > 0);
            if (row > half + 1) {
                elements++;
            } else {
                elements--;
            }
            row--;
        } while (row > 0);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("Dec   Char");
        for (char i = 1; i < 47; i+=2) {
            System.out.printf("%3d  -  %2c%n", (int) i, i);
        }
        for (char i = 98; i < 122; i += 2) {
            System.out.printf("%3d  -  %2c%n", (int) i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int tempNum = srcNum;
        int lastNum = 0;
        int reverse = 0;
        while (tempNum > 0) {
            lastNum = tempNum % 10;
            reverse = reverse * 10 + lastNum;
            tempNum /= 10;
            System.out.println(reverse);
        }
        if (srcNum == reverse) {
            System.out.printf("The number %d is a palyndrom", srcNum);
        } else {
            System.out.printf("The number %d is not a palyndrom", srcNum);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        srcNum = 345432;
        int sum1 = 0;
        int sum2 = 0;
        count = 0;
        while (srcNum > 0) {
            count++;
            if (count < 4) {
                sum2 += srcNum % 10;
                srcNum /= 10;
            } else {
                sum1 += srcNum % 10;
                srcNum /=10;
            }
        }
        System.out.println("The sum of abc digits is: " + sum1);
        System.out.println("The sum of def digits is: " + sum2);
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
        System.out.print("\n");
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