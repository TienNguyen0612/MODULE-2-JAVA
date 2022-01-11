package baitap;

import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1 - 999:");
        int number = scanner.nextInt();

        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = number % 10;

        if (number < 0 || number > 999) {
            System.out.println("Nhập sai giá trị rồi, không đọc được đâu");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            String word = donVi(number);
            System.out.println(word);
        } else {
            String word;
            if (hangTram == 0) {
                word = hangChuc(hangChuc) + " " + donVi(hangDonVi);
            } else if (hangChuc == 1) {
                word = donVi(hangTram) + " hundred and " + donVi(number % 100);
            } else {
                word = donVi(hangTram) + " hundred and " + hangChuc(hangChuc) + " " + donVi(hangDonVi);
            }
            System.out.println(word);
        }
    }

    public static String hangChuc(int number) {
        String hangChucWord = "";
        switch (number) {
            case 2:
                hangChucWord = "twenty";
                break;
            case 3:
                hangChucWord = "thirty";
                break;
            case 4:
                hangChucWord = "fourty";
                break;
            case 5:
                hangChucWord = "fifty";
                break;
            case 6:
                hangChucWord = "sixty";
                break;
            case 7:
                hangChucWord = "seventy";
                break;
            case 8:
                hangChucWord = "eighty";
                break;
            case 9:
                hangChucWord = "ninety";
                break;
        }
        return hangChucWord;
    }

    public static String donVi(int number) {
        String donViWord = "";
        switch (number) {
            case 1:
                donViWord = "one";
                break;
            case 2:
                donViWord = "two";
                break;
            case 3:
                donViWord = "three";
                break;
            case 4:
                donViWord = "four";
                break;
            case 5:
                donViWord = "five";
                break;
            case 6:
                donViWord = "six";
                break;
            case 7:
                donViWord = "seven";
                break;
            case 8:
                donViWord = "eight";
                break;
            case 9:
                donViWord = "nine";
                break;
            case 10:
                donViWord = "ten";
                break;
            case 11:
                donViWord = "eleven";
                break;
            case 12:
                donViWord = "twelve";
                break;
            case 13:
                donViWord = "thirteen";
                break;
            case 14:
                donViWord = "fourteen";
                break;
            case 15:
                donViWord = "fifteen";
                break;
            case 16:
                donViWord = "sixteen";
                break;
            case 17:
                donViWord = "seventeen";
                break;
            case 18:
                donViWord = "eighteen";
                break;
            case 19:
                donViWord = "nineteen";
                break;
        }
        return donViWord;
    }
}
