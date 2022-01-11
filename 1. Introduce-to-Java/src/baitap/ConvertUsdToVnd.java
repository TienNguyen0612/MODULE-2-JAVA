package baitap;

import java.util.Scanner;

public class ConvertUsdToVnd {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số USD:");
        double usd = scanner.nextDouble();
        double exchange = usd * vnd;

        System.out.println("Giá trị VND: " + exchange);
    }
}
