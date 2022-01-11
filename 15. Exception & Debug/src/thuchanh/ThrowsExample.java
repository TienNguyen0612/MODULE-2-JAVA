package thuchanh;

import java.io.IOException;

public class ThrowsExample {
    void method() throws IOException {
        throw new IOException("device error");
    }

    public static void main(String[] args) throws IOException {
        ThrowsExample obj = new ThrowsExample();
        obj.method();
        System.out.println("normal flow...");
    }
}
