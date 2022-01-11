package baitap.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp theo giá tăng dần");
            System.out.println("7. Sắp xếp theo giá giảm dần");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Product product = productManager.createProduct(scanner);
                    productManager.addProduct(product);
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm muốn sửa:");
                    int idUpdate = scanner.nextInt();
                    System.out.println(productManager.updateById(idUpdate));
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm muốn xóa:");
                    int idDelete = scanner.nextInt();
                    productManager.deleteProduct(idDelete);
                    break;
                case 4:
                    productManager.displayAll();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm muốn tìm:");
                    String nameSearch = scanner.nextLine();
                    productManager.searchByName(nameSearch);
                    break;
                case 6:
                    productManager.sortByPriceIncrease();
                    productManager.displayAll();
                    break;
                case 7:
                    productManager.sortByPriceDecrease();
                    productManager.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}
