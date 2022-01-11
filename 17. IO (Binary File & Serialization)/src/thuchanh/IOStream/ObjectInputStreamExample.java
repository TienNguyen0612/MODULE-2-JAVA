package thuchanh.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/thuchanh/IOStream/product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
