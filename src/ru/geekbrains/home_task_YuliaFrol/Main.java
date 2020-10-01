package ru.geekbrains.home_task_YuliaFrol;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();
        System.out.println(checkBalance());
    }
    //    Задание № 1:
    public static void invertArray() {
        int[] arr = {0,0,1,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    //    Задание № 2:
    public static void fillArray() {
        int counter = 0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter += 3;
        }
        System.out.println(Arrays.toString(arr));

    }
    //    Задание № 3:
    public static void changeArray() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //    Задание № 4:
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    //    Задание № 5:
    public static void findMinMax() {
        int[] arr = {8, 4, 3, 24, 11, 4, 12, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min + "\t max = " + max);
    }
    //    Задание № 6:
    public static boolean checkBalance() {
        int[] arr = {5,2,3,6,4};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int left = 0;
        int right = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            left += arr[i - 1];
            right = total - left;
            if (right == left) {
                System.out.println("That's it!");
            }
        }
        if (right == left) {
            return true;
        } else {
            return false;
        }
    }
}
