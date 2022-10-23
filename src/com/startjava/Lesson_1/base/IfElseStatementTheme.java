package src.com.startjava.Lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        if (age > 20) {
            System.out.println("We have yoga and massage sessions on Sundays\n");
        } else {
            System.out.println("We have football games on Sundays\n");
        }

        boolean female = true;;
        if (!female) {
            System.out.println("We have a variety of martial arts and athletics sections\n");
        } else {
            System.out.println("Choose one of our amazing yoga or SPA programmes\n");
        }

        double height = 1.64;
        if (height < 1.80) {
            System.out.println("Note our gym and swimmig section\n");
        } else {
            System.out.println("Our basketball and volleyball teams need you!\n");
        }


        char nameFirstLetter = "Mary".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Special MMMore SPA-session for our MMM lovely clients\n");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Special IIIdeal massage session for our III lovely clients\n");
        } else {
            System.out.println("Special 10% off for any second section for our lovely clients\n");
        }

        System.out.println("/n2. Поиск max и min числа");
        int num1 = 5;
        int num2 = 8;
        if (num2 > num1) {
            System.out.println("Max number: " + num2 + ", min number: " + num1);
        } else if (num1 > num2) {
            System.out.println("Max number: " + num1 + ", min number: " + num2);
        } else {
            System.out.println("Equal numbers");
        }

        System.out.println("\n3. Работа с числом");
        int srcNum = 5;
        System.out.println("Source number is: " + srcNum);
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.println("Odd number");
            } else {
                System.out.println("Even number");
            }
            if (srcNum > 0) {
                System.out.println("Positive number");
            } else {
                System.out.println("Negative number");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 445;
        num2 = 432;
        System.out.println("First number: " + num1 + "\nSecond number: " + num2);
        if (num1 % 10 == num2 % 10) {
            System.out.println("Equal ones are: " + num2 % 10);
        } else if (num1 /10 % 10 == num2 / 10 % 10) {
            System.out.println("Equal dozens are: " + num2 / 10 % 10);
        } else if (num1 / 100 == num2 / 100) {
            System.out.println("Equal hundreds are: " + num2 / 100);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.println("The char is: " + symbol);
        if ((int) symbol  > 64 && (int) symbol < 91) {
            System.out.println("It's an uppercase letter");
        } else if ((int) symbol > 47 && (int) symbol < 58) {
            System.out.println("It's a number");
        } else if ((int) symbol > 60 && (int) symbol < 123) {
            System.out.println("It's a lowercase letter");
        } else {
            System.out.println("It's niether a letter, nor a number");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        int percent = 0;
        if (depositAmount < 100_000) {
            percent = 5;
        } else if (depositAmount > 100_000 && depositAmount <= 300_000) {
            percent = 7;
        } else if (depositAmount > 300_000) {
            percent = 10;
        }
        System.out.println("Deposit amount is: " + depositAmount);
        int depositIncome = depositAmount / 100 * percent;
        int totalAmount = depositAmount + depositIncome;
        System.out.println("Deposit income is: " + depositIncome);
        System.out.println("Total amount is: " + totalAmount);

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int historyScore = 0;
        int programming = 91;
        int progScore = 0;
        if (history <= 60) {
            historyScore = 2;
        } else if (history > 60 && history <= 73) {
            historyScore = 3;
        } else if (history > 73 && history <= 91) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }

        if (programming <= 60) {
            progScore = 2;
        } else if (programming > 60 && programming <= 73) {
            progScore = 3;
        } else if (programming > 73 && programming <= 91) {
            progScore = 4;
        } else {
            progScore = 5;
        }

        int averageScore = (historyScore + progScore) / 2;
        int averagePercent = (history + programming) / 2;
        System.out.println(historyScore + " - History");
        System.out.println(progScore + " - Programming");
        System.out.println(averageScore + " - Average Score");
        System.out.println(averagePercent + " - Average Percent");

        System.out.println("\n8. Расчет прибыли");
        int shopRent = 5000;
        int productSold = 13000;
        int productCosts = 9000;
        int yearProfit = (productSold - productCosts - shopRent) * 12;
        if (yearProfit > 0) {
            System.out.println("A year profit is: +" + yearProfit);
        } else {
            System.out.println("A year profit is: " + yearProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        srcNum = 567;
        int ones = srcNum % 10;
        int dozens = srcNum / 10 % 10;
        int hundreds = srcNum / 100;
        int tens = 5;
        if (tens < dozens) {
            ones += (dozens - tens) * 10;
            dozens -= (dozens - tens);
        }
        int reverseCount = ones + (dozens * 10) + (hundreds * 100);
        System.out.println("Hundreds = " + hundreds + "\ndozens = " + 
                dozens + "\nones = " + ones);
        System.out.println("Sourse number is: " + reverseCount);
    }
}