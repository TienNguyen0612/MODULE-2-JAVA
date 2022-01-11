package baitap.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private final ArrayList<Product> listProducts;
    private final Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        this.listProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        listProducts.add(product);
    }

    public Product updateById(int id) {
        Product productUpdate = null;
        for (Product product : listProducts) {
            if(product.getId() == id) {
                productUpdate = product;
            }
        }
        if (productUpdate != null) {
            scanner.nextLine();
            System.out.println("Nhập tên mới:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                productUpdate.setName(productUpdate.getName());
            } else {
                productUpdate.setName(name);
            }
            System.out.println("Nhập giá mới:");
            productUpdate.setPrice(scanner.nextDouble());
            return productUpdate;
        }
        return null;
    }

    public void deleteProduct(int id) {
//        for (Product p: products) {
//            if (p.getId() == id) {
//                product = p;
//            }
//        }
//        products.remove(product);
//        System.out.println("Xóa thành công !");

        listProducts.removeIf(product -> product.getId() == id);
        System.out.println("Xóa thành công !");
    }

    public void displayAll() {
        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

    public void searchByName(String name) {
        for (Product product : listProducts) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
        System.out.println("Không tìm thấy sản phẩm !");
    }

    public void sortByPriceIncrease() {
        listProducts.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
    }

    public void sortByPriceDecrease() {
        listProducts.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
    }

    public Product createProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm:");
        double price = scanner.nextDouble();
        return new Product(name, price);
    }
}
