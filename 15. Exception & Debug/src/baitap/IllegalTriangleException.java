package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException ex = new IllegalTriangleException();
        try {
            ex.calculate();
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra ngoại lệ: Nhập sai dữ liệu");
        }
    }

    private void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh x:");
        int x = scanner.nextInt();
        System.out.println("Nhập vào cạnh y:");
        int y = scanner.nextInt();
        System.out.println("Nhập vào cạnh z:");
        int z = scanner.nextInt();
        if (x < 0 || y < 0 || z < 0)
            throw new InputMismatchException();
        cal(x, y, z);
    }

    private void cal(int x, int y, int z) {
        try {
            if (x + y <= z || y + z <= x || x + z <= y)
                throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra lỗi điều kiện các cạnh của tam giác");
        }
    }
}
