package com.startjava.Lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] nums1 = {3, 6, 4, 1, 7, 2, 5};
        int size = nums1.length;

        for (int number : nums1) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < size/2; i++) {
            int temp = nums1[i];
            nums1[i] = nums1[size - i - 1];
            nums1[size - i - 1] = temp;
        }

        for (int number : nums1) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        size = 10;
        int[] nums2 = new int[size];
        String pow = "";
        int result = 1;
        for (int i = 0; i < size; i++) {
            nums2[i] = i;
            switch (nums2[i]) {
                case 0: case 9:
                    System.out.printf("Number %d has index %d%n", nums2[i], i);
                    break;
                case 8:
                    pow += nums2[i] + "=";
                    result *= nums2[i];
                    break;
                default:
                    pow += nums2[i] + "+";
                    result *= nums2[i];
                    break;
            }
        }
        System.out.println(pow + result);

        System.out.println("\n3. Удаление элементов массива");
        size = 15;
        float[] nums3 = new float[size];
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            nums3[i] = rnd.nextFloat();
            System.out.printf("%8.3f", nums3[i]);
            if (i == size/2) System.out.println();
        }

        float midNum = nums3[size/2 + 1];
        int count = 0;
        System.out.printf("\nThe middle number is %6.3f\n", midNum);

        for (int i = 0; i < size; i++) {
            if (nums3[i] > midNum) {
                nums3[i] = 0;
                count++;
            }
            System.out.printf("%8.3f", nums3[i]);
            if (i == size/2) System.out.println();
        }
        System.out.println("\nThe number of zeroes is " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        size = 26;
        char[] letters = new char[size];
        letters[0] = '\u0041';
        for (int i = 1; i < size; i++) {
            letters[i] = (char) (letters[i - 1] + 1);
        }

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= size - 1 - i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int i, j;
        size = 30;
        int[] nums4 = new int[size];
        int tryNum = 0;
        for (i = 0; i < size;) {
            tryNum = (int) (Math.random() * 40 + 60);
            for (j = 0; j < i; j++) {
                if (tryNum == nums4[j]) {
                    break;
                }
            }
            if (i == j) {
                nums4[i] = tryNum;
                System.out.print(nums4[i] + " ");
                i++;
            }
        }
        int temp = 0;
        System.out.println();
        for (int k = size - 1; k >= 0; k--) {
            for (int l = 0; l < k; l++) {
                if (nums4[l] < nums4[l + 1]) {
                    temp = nums4[l];
                    nums4[l] = nums4[l + 1];
                    nums4[l + 1] = temp;
                }
            }
            System.out.print(nums4[k] + " ");
        }
    }
}


