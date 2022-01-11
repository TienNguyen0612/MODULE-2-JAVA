package thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        String pass;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter String: ");
            pass = scanner.nextLine();
            Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$]).{8,20}$"); //a Trung Trần
//            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\s])(.*[a-z]){8,}$"); //a Trung Dương
//            Pattern pattern = Pattern.compile("((^\\(\\+84\\))(\\s)([^0]\\d{8})$)|((^\\(\\+84\\))(\\s)(0\\d{9})$)"); //a Hào
//            Pattern pattern = Pattern.compile("^[(](\\+84)[)][-][([^0]][0-9]{10,11}[)]$"); //Huấn rô sì
//            Pattern pattern = Pattern.compile("^[a-z][a-z0-9]{0,9}\\.[a-z0-9]{1,10}@[a-z]+\\.(com|vn)$"); //Cường béo
            Matcher matcher = pattern.matcher(pass);
            if (matcher.find()) {
                System.out.println("OK!");
            } else {
                System.out.println("NOT!");
            }
        } while (!pass.equals("a"));
    }
}
