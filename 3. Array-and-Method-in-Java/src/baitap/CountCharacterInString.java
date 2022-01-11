package baitap;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int count = 0;
        System.out.println("Nhập vào một chuỗi:");
        str = sc.nextLine();
        System.out.println("Nhập vào một ký tự bất kỳ:");
        char character = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        if (count == 0) System.out.println("Ký tự vừa nhập không có trong chuỗi");
        else System.out.println("Ký tự '" + character + "' xuất hiện " + count + " lần");
    }
}
