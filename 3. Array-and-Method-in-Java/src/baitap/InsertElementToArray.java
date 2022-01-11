package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementToArray {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        int index;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn chèn vào mảng:");
        input = sc.nextInt();

        do {
            System.out.println("Nhập vị trí muốn chèn:");
            index = sc.nextInt();
            int[] array = new int[arr.length];
            for (int i = 0; i < index; i++) {
                array[i] = arr[i];
            }
            for (int i = arr.length - 1; i > index; i--) {
                array[i] = arr[i - 1];
            }
            array[index] = input;
            System.out.println("New Array = " + Arrays.toString(array));
        } while (index < 0 || index > arr.length - 1);
    }
}
