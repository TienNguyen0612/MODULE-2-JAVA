package baitap;

import java.util.Scanner;

public class SumOfColumnInArray {
    public static void main(String[] args) {
        double[][] arr;
        Scanner sc = new Scanner(System.in);
        int row, column;
        do {
            System.out.print("Nhập số hàng: ");
            row = sc.nextInt();
            System.out.print("Nhập số cột: ");
            column = sc.nextInt();
            if (row > 5 || column > 5)
                System.out.println("Mời nhập lại:");
        } while (row > 5 || column > 5);
        arr = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Array =");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + ",\t");
            }
            System.out.println();
        }
        sumColumn(arr);
    }

    public static void sumColumn(double[][] arr) {
        Scanner sc = new Scanner(System.in);
        int column;
        double sum = 0;
        do {
            System.out.println("Nhập cột muốn tính tổng:");
            column = sc.nextInt();
            if (column > arr[0].length)
                System.out.println("Không có cột cần tính, nhập lại nhé !");
        } while (column > arr[0].length);
        for (double[] doubles : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == column - 1)
                    sum += doubles[j];
            }
        }
        System.out.println("Tổng các phần tử ở cột thứ " + column + " = " + sum);
    }
}
