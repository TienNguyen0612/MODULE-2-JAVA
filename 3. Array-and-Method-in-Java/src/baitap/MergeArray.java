package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[3];
        int[] arr3 = new int[8];
        System.out.println("Nhập mảng arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập mảng arr2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Mảng arr1 = " + Arrays.toString(arr1));
        System.out.println("Mảng arr2 = " + Arrays.toString(arr2));
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr3.length - arr2.length, arr2.length);
        System.out.println("Mảng arr3 = " + Arrays.toString(arr3));
    }
}
