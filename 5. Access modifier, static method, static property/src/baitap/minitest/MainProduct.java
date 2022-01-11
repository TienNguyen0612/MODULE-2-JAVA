package baitap.minitest;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[quantityProduct(scanner)];
        int choice = -1;

        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) +":");
            Product product = createProduct(scanner);
            products[i] = product;
        }
        for (Product product : products) {
            System.out.println(product);
        }
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tìm sản phẩm");
            System.out.println("2. Tính tổng giá sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    findProduct(products);
                    break;
                case 2:
                    sumProduct(products);
                    break;
                case 3:
                    editProduct(scanner, products);
                    break;
                case 4:
                    deleteProduct(scanner, products);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static void deleteProduct(Scanner scanner, Product[] products) {
        Product[] result = new Product[(products.length -1)];
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        int idProduct = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            if (idProduct != products[i].getId()) {
                result[index] = products[i];
                index++;
            }
        }
        for (Product product : result) {
            System.out.println(product);
        }
    }

    private static void editProduct(Scanner scanner, Product[] products) {
        System.out.print("Nhập id sản phẩm muốn sửa: ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (idProduct == products[i].getId()) {
                System.out.print("Nhập lại tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập lại giá sản phẩm: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Nhập lại loại sản phẩm: ");
                String type = scanner.nextLine();

                products[i].setName(name);
                products[i].setPrice(price);
                products[i].setType(type);
            }
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static int quantityProduct(Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm: ");
        int input = scanner.nextInt();
        return input;
    }

    public static void findProduct(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm:");
        String name = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println(products[index].toString());
        } else {
            System.out.println("Không tìm thấy sản phẩm nào");
        }
    }

    public static void sumProduct(Product[] products) {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        System.out.printf("Tổng giá các sản phẩm: %.2f %s\n", sum, products[0].getMoneyUnit() );
    }

    public static Product createProduct(Scanner scanner) {
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập loại sản phẩm: ");
        String type = scanner.nextLine();
        return new Product(id, name, price, type);
    }
}
