package thuchanh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/thuchanh/CodeGym.txt");
        int i = -1;

        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
        is.close();
    }
}
