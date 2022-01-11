package baitap.FizzBuzz;

import java.util.Scanner;

import static baitap.FizzBuzz.FizzBuzz.*;

public class TestFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        getWord(num);
        System.out.println(getResult(num));
    }
}
