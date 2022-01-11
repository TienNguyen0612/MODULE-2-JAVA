package baitap;

import java.util.Scanner;

public class SumMainDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        do {
            System.out.print("Nhập số hàng: ");
            row = sc.nextInt();
            System.out.print("Nhập số cột: ");
            column = sc.nextInt();
            if (row != column)
                System.out.println("Số hàng khác số cột, mời nhập lại");
        } while (row != column);
        double[][] arr = new double[row][column];
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
        sumMainDiagonal(arr);
    }
    public static void sumMainDiagonal(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính = " + sum);
    }
}
