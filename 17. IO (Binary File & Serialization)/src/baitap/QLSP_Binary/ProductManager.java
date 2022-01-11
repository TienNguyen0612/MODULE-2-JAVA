package baitap.QLSP_Binary;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products;
    File fileProduct = new File("src/baitap/QLSP_Binary/products");
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        if (fileProduct.length() == 0) {
            products = new ArrayList<>();
        } else {
            try {
                products = readProductFromFile("src/baitap/QLSP_Binary/products");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product addProduct() {
        Product product = null;
        System.out.println("Nhập vào mã sản phẩm:");
        String code = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất:");
        String brand = scanner.nextLine();
        System.out.println("Nhập vào giá:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào tình trạng:");
        String description = scanner.nextLine();
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                System.out.println("Trùng mã sản phẩm, mời nhập lại !");
                return addProduct();
            }
        }
        product = new Product(code, name, brand, price, description);
        products.add(product);
        return product;
    }

    public void displayAll() {
        products.forEach(System.out::println);
    }

    public void searchByCode(String code) {
        Product product = null;
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                System.out.println(p);
                product = p;
            }
        }
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public void writeProductToFile(ArrayList<Product> products, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
        System.err.println("Write successfully!");
    }

    public ArrayList<Product> readProductFromFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        return (ArrayList<Product>) objectInputStream.readObject();
    }
}
