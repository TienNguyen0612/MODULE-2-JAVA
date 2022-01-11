package baitap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list:");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Assign x = " + array[i] + ", pos = " + i);
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Swap " + array[pos] + " = " + array[pos - 1]);
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;

            System.out.print("List after the " + i + " sort: ");
            for (int k : array) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
