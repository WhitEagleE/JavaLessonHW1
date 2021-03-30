package lesson2.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();

    }





    public static void ex1() {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void ex2() {
        int[] arr2 = new int[8];
        int n = 0;
        for (int i = 0; i < 8; i++) {
            arr2[i] = n;
            n += 3;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void ex3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void ex4() {
        int size = 10;
        int[][] arr4 = new int[size][size];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.printf("%d ", arr4[i][j]);
            }System.out.println();
        }

    }

    public static void ex5() {
        int[] arr5 = {1, 5, 14, 235, 56, 657, 23, 314, 5, 25};
        int min = 0;
        int max = 0;


        for (int i = 0; i < arr5.length; i++) {
            if (arr5[0] < arr5[i]) {
                min = arr5[0];
            } else {
                min = arr5[i];
            }
            if (max < arr5[i]) {
                max = arr5[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void ex6() {

        int[] arr6 = {10, 2, 4, 5, 5, 5, 1};
        int result = 0;
        int summleft = 0;
        int summright = 0;
        for (int i = 0; i < arr6.length; i++) {

            summleft = arr6[i] + summleft;
            for (int j = arr6.length - 1; j >= 0; j--) {
                summright = summright + arr6[j];
            }
            summright = summright - summleft;
            if (summright == summleft) {
                result = 1;
                summright = 0;

                break;
            }else{
                summright = 0;

            }


        }
        if (result > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
