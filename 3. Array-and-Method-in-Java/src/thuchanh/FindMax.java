package thuchanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số lượng phần tử không được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mảng vừa nhập: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " ở vị trí " + index);
    }
}
