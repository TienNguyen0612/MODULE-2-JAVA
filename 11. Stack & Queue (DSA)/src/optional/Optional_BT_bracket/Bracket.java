package optional.Optional_BT_bracket;

import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        String[] strings = string.split("");

        int count = 0;
        int count1 = 0;

        for (String str : strings) {
            if (str.equals("(")) {
                count++;
            } else if (str.equals(")")) {
                count1++;
            }
        }

        if (count == count1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
