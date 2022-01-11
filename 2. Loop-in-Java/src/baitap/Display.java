package baitap;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        int number, N = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị các số nguyên tố nhỏ hơn:");
        number = sc.nextInt();

        while (N < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
