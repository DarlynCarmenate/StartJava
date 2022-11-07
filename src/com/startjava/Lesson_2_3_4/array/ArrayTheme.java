package com.startjava.Lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] nums1 = {3, 6, 4, 1, 7, 2, 5};
        int len = nums1.length;

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < len;) {
            int temp = nums1[i];
            nums1[i++] = nums1[--len];
            nums1[len] = temp;
        }

        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        len = 10;
        int[] nums2 = new int[len];
        int result = 1;

        for (int i = 0; i < len; i++) {
            nums2[i] = i;
        }

        for (int i = 0; i < len; i++) {
            System.out.print( (nums2[i] > 0 && nums2[i] < 8) ? nums2[i] + " * " : "");
            System.out.print( (nums2[i] == 8) ? nums2[i] + " = " : "");
            if (nums2[i] > 0 && nums2[i] < 9) {
                result *= nums2[i];
            }
        }
            System.out.println(result);
        System.out.printf("Number %d has an index %d%n", nums2[0], 0);
        System.out.printf("Number %d has an index %d", nums2[len - 1], len - 1);

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        float[] nums3 = new float[len];
        Random rnd = new Random();

        for (int i = 0; i < len; i++) {
            nums3[i] = rnd.nextFloat();
            System.out.printf("%8.3f", nums3[i]);
            if (i == len / 2) System.out.println();
        }

        float midNum = nums3[len / 2 + 1];
        int count = 0;
        System.out.printf("\nThe middle number is %6.3f\n", midNum);

        for (int i = 0; i < len; i++) {
            if (nums3[i] > midNum) {
                nums3[i] = 0;
                count++;
            }
            System.out.printf("%8.3f", nums3[i]);
            if (i == len / 2) System.out.println();
        }
        System.out.println("\nThe number of zeroes is " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] letters = new char[len];
        for (int i = 0; i < len; i++) {
            letters[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= len - 1 - i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int i, j;
        len = 30;
        int[] nums4 = new int[len];
        int tryNum = 0;
        for (i = 0; i < len;) {
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
        for (int k = len - 1; k >= 0; k--) {
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


