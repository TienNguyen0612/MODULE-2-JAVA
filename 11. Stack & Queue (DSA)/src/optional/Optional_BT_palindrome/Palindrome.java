package optional.Optional_BT_palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        PalindromeStack<String> palindromeStack = new PalindromeStack<>();

        String[] strings = string.toLowerCase().split("");

        for (String str : strings) {
            palindromeStack.push(str);
        }

        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = palindromeStack.pop();
        }

        if (Arrays.equals(strings, strings1)) {
            System.out.println("This string is a palindrome string !");
        } else {
            System.out.println("This string is not a palindrome string !");
        }
    }
}
