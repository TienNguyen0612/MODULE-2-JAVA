package baitap.QLSP_Binary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String PATH_NAME = "src/baitap/QLSP_Binary/products";

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Add Product");
            System.out.println("2. Display All");
            System.out.println("3. Search Product");
            System.out.println("4. Write Product To File");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập vào mã sản phẩm:");
                    String codeSearch = scanner.nextLine();
                    productManager.searchByCode(codeSearch);
                    break;
                case 4:
                    try {
                        ArrayList<Product> productArrayList = productManager.getProducts();
                        productManager.writeProductToFile(productArrayList, PATH_NAME);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
            }
        } while (choice != 0);
    }
}
