public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        byte memo = 4;
        short winVersion = 10; // Windows
        int cpu = 64; // процессор
        long year = 2019; // 
        float cpuFreq = 1.51f; // GHz
        double freeMemo = 3.90; // Доступно памяти на устройстве
        char cpuType = 'x';
        boolean myComp = true;
        if (myComp) {
            System.out.println("Операционная система: Windows " + winVersion + 
                            ", " + year + " год" + "\n" +
                            "Установленная память: " + memo + " Гб" + "\n" +
                            "Свободная память: " + freeMemo + " Гб" + "\n" +
                            "Процессор: " + cpuType + cpu + "\n" +
                            "Частота процессора: " + cpuFreq + " ГГц");
            }
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = (penPrice + bookPrice) / 100 * 11;
        double finalPrice = (penPrice + bookPrice) - discount;
        System.out.println("Discount is: " + discount);
        System.out.println("Final price for both items is: " + finalPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a"); 

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte firstNum = 127;
        short secondNum = 32_767;
        int thirdNum = 2_147_483_647;
        long forthNum = 9_223_372_036_854_775_807L;

        System.out.println(firstNum);
        System.out.println(++firstNum);
        System.out.println(--firstNum);

        System.out.println(secondNum);
        System.out.println(++secondNum);
        System.out.println(--secondNum);

        System.out.println(thirdNum);
        System.out.println(++thirdNum);
        System.out.println(--thirdNum);

        System.out.println(forthNum);
        System.out.println(++forthNum);
        System.out.println(--forthNum);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println(num1 + " " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println(num1 + " " + num2);
        System.out.println("Перестановка с помощью арифметической операции");
        System.out.println(num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println(num1 + " " + num2);
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println(num1 + " " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(num1 + " " + num2); 

        System.out.println("\n6. Вывод символов и их кодов"); 
        byte code1 = 35;
        char sym1 = 35;
        byte code2 = 38;
        char sym2 = 38;
        byte code3 = 64;
        char sym3 = 64;
        byte code4 = 94;
        char sym4 = 94;
        byte code5 = 95;
        char sym5 = 95;
        System.out.println(code1 + " - " + sym1);
        System.out.println(code2 + " - " + sym2);
        System.out.println(code3 + " - " + sym3);
        System.out.println(code4 + " - " + sym4);
        System.out.println(code5 + " - " + sym5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;
        System.out.println("Число N содержит:");
        System.out.println((srcNum / 100) + " сотню");
        System.out.println((srcNum / 10 % 10) + " десятка");
        System.out.println((srcNum % 10) + " единицы");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = 0;
        char backsl = 92;
        char slash = 47;
        char under = 95; 
        char openBr = 40;
        char closeBr = 41;
        System.out.println(space + "" + space + "" + space + "" + space + "" + slash + "" + backsl);
        System.out.println(space + "" +  space + "" +  space + "" +  slash + "" +  space + "" +  
                            space + "" +  backsl);
        System.out.println(space + "" +  space + "" +  slash + "" +  under + "" +  openBr + "" +
                            space + "" + closeBr + "" +  backsl);
        System.out.println(space + "" +  slash + "" +  space + "" +  space + "" +  space + "" +  
                            space + "" + space + "" +  space + "" +  backsl);
        System.out.println(slash + "" +  under + "" +  under + "" +  under + "" +  under + "" +
                            slash + "" + backsl + "" +  under + "" +  under + "" +  backsl);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int numberN = 345;
        int units = numberN % 10;
        int dozens = numberN / 10 % 10;
        int hundreds = numberN / 100;
        System.out.println("Сумма цифр числа N: " + (units + dozens + hundreds));
        System.out.println("Произведение цифр числа N: " + (units * dozens * hundreds));

        System.out.println("\n10. Преобразование секунд");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minsDiff = totalSec % 3600;
        int mins = minsDiff / 60;
        int seconds =  minsDiff % 60;
        System.out.println(hours + ":" + mins + ":" + seconds);
    }
}