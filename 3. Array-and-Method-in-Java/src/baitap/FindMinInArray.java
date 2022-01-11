package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Số lượng phần tử không được vượt quá 10");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Array = " + Arrays.toString(array));
        findMin(array);
    }
    public static void findMin(int[] arr) {
        int min = arr[0];
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i + 1;
            }
        }
        System.out.println("Min of Array = " + min + " at position " + index);
    }
}
