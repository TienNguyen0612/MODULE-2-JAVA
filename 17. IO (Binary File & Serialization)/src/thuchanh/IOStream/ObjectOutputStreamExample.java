package thuchanh.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/thuchanh/IOStream/product.txt"));
            Product product = new Product(1, "Iphone 13", 28000000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
