package baitap.Validate_Phone_Number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            System.out.println("Enter your phone number:");
            String input = scanner.nextLine();
            String regex = "^[(][0-9]{2}[)][-][(][0-9]{9}[)]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            boolean result = matcher.matches();
            check = result;
            System.out.println(result);
        }
    }
}
