package com.startjava.Lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] nums1 = {3, 6, 4, 1, 7, 2, 5};
        int len = nums1.length;

        printArray(nums1);
        System.out.println();

        for (int i = 0; i < len; i++) {
            int temp = nums1[i];
            nums1[i] = nums1[--len];
            nums1[len] = temp;
        }

        printArray(nums1);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        len = 10;
        int[] nums2 = new int[len];
        int prodDigits = 1;

        for (int i = 0; i < len; i++) {
            nums2[i] = i;
        }

        for (int i = 1; i < len - 1; i++) {
            System.out.print((nums2[i] == 8) ? nums2[i] + " = " : nums2[i] + " * ");
            prodDigits *= nums2[i];
        }
        System.out.println(prodDigits);
        System.out.printf("Number %d has an index %d%n", nums2[0], 0);
        System.out.printf("Number %d has an index %d", nums2[len - 1], len - 1);

        System.out.println("\n\n3. Удаление элементов массива");
        len = 15;
        float[] nums3 = new float[len];
        Random rnd = new Random();

        for (int i = 0; i < len; i++) {
            nums3[i] = rnd.nextFloat();
        }

        printFloatArray(nums3);

        float midNum = nums3[len / 2 + 1];
        int count = 0;
        System.out.printf("\nThe middle number is %6.3f\n", midNum);

        for (int i = 0; i < len; i++) {
            if (nums3[i] > midNum) {
                nums3[i] = 0;
                count++;
            }
        }

        printFloatArray(nums3);

        System.out.println("\nThe number of zeroes is " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] alphabet = new char[len];
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= len - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        int[] uniqueNums = new int[len];
        int trialNum = 0;
        for (int i = 0; i < len; ) {
            trialNum = (int) (Math.random() * 40 + 60);
            int j;
            for (j = 0; j < i; j++) {
                if (trialNum == uniqueNums[j]) {
                    break;
                }
            }
            if (i == j) {
                uniqueNums[i] = trialNum;
                System.out.print(uniqueNums[i] + " ");
                i++;
            }
        }
        int temp = 0;
        System.out.println();
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] < uniqueNums[j + 1]) {
                    temp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp;
                }
            }
            System.out.print(uniqueNums[i] + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void printFloatArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f", arr[i]);
            if (i == arr.length / 2) System.out.println();
        }
    }
}



