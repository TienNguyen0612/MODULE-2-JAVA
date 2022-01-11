package baitap;

import java.util.Scanner;

public class InsertElementToArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        int indexRow, indexColumn;
        double[][] arr;
        do {
            System.out.print("Nhập số hàng: ");
            row = sc.nextInt();
            System.out.print("Nhập số cột: ");
            column = sc.nextInt();
            if (row > 5 || column > 5)
                System.out.println("Mảng to quá, nhập lại đi");
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
        System.out.print("Nhập phần tử muốn chèn vào mảng: ");
        double input = sc.nextDouble();
        do {
            System.out.println("Nhập vào vị trí muốn chèn:");
            System.out.print("Nhập vị trí hàng: ");
            indexRow = sc.nextInt();
            System.out.print("Nhập vị trí cột: ");
            indexColumn = sc.nextInt();
            if (indexRow < 0 || indexColumn < 0 || indexRow > arr.length || indexColumn > arr[0].length)
                System.out.println("Không chèn được, nhập lại đi");
        } while (indexRow < 0 || indexColumn < 0 || indexRow > arr.length || indexColumn > arr[0].length);

        int index = 0;
        double[][] newArray = new double[arr.length][arr[0].length + 1];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if (!(i == indexRow && j == indexColumn)) {
                    newArray[i][j] = arr[i][index];
                    if (index < arr.length - 1) {
                        index++;
                    }
                } else {
                    newArray[indexRow][indexColumn] = input;
                }
            }
            index = 0;
        }
        for (int i = 0; i < newArray.length; i++) {
            if (indexRow != i) {
                newArray[i][newArray[i].length - 1] = 0;
            }
        }
        System.out.println("New Array = ");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + ",\t");
            }
            System.out.println();
        }
    }
}
