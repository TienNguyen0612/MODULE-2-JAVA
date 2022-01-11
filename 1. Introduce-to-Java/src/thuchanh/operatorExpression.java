package thuchanh;

import java.util.Scanner;

public class operatorExpression {

    public static void main(String[] args) {
	// write your code here
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
