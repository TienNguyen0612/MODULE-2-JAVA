package baitap;

import java.util.Scanner;

public class DrawTypes {

    public static void drawSquareTriangle(int input) {
        switch (input) {
            case 1:
                System.out.println("Print the square triangle (The corner is square at top-left)");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print the square triangle (The corner is square at top-right)");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 4; j >= 0; j--) {
                        if (j <= 5 - i) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print the square triangle (The corner is square at bottom-left)");
                for (int i = 1; i <= 5 ; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Print the square triangle (The corner is square at bottom-right)");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j <= 4; j++) {
                        if (j <= 4 - i) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void main(String[] args) {
	// write your code here
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("1. Print the square triangle (The corner is square at top-left)");
                    System.out.println("2. Print the square triangle (The corner is square at top-right)");
                    System.out.println("3. Print the square triangle (The corner is square at bottom-left)");
                    System.out.println("4. Print the square triangle (The corner is square at bottom-right)");
                    System.out.println("Enter your choice:");
                    choice = input.nextInt();
                    drawSquareTriangle(choice);
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int k = 0;
                    for (int i = 1; i <= 6 ; i++, k = 0) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            k++;
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
