package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 3, 4, 8, 5, 5, 9, 8, 2, 7};
        System.out.println("Có mảng:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Nhập phần tử muốn xóa:");
        input = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (input != arr[i]) {
                System.out.println("Không có phần tử muốn xóa trong mảng");
                break;
            } else {
                while (input == arr[i]) {
                    System.arraycopy(arr, i + 1, arr, i, arr.length - 1 - i);
                    arr[arr.length - 1] = 0;
                }
            }
        }
        System.out.println("Array = " + Arrays.toString(arr));
    }
}
