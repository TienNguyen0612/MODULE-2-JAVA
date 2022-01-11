package thuchanh2.manager;

import thuchanh2.model.Receipt;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Manager {
    HashMap<Integer, Receipt> receipts;
    Scanner scanner = new Scanner(System.in);
    File fileReceipt = new File("src/thuchanh2/receipts");

    public Manager() {
        if (fileReceipt.length() == 0) {
            receipts = new HashMap<>();
        } else {
            try {
                receipts = readReceiptsFromFile("src/thuchanh2/receipts");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public HashMap<Integer, Receipt> getReceipts() {
        return receipts;
    }

    public boolean addReceipt() {
        System.out.println("Nhập vào tên chủ hộ:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào số nhà:");
        int homeNumber = scanner.nextInt();
        System.out.println("Nhập vào mã số công tơ:");
        int idElectric = scanner.nextInt();
        System.out.println("Nhập vào chỉ số cũ:");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập vào chỉ số mới:");
        int newIndex = scanner.nextInt();
        scanner.nextLine();
        if (oldIndex <= newIndex) {
            Receipt receipt = new Receipt(name, homeNumber, idElectric, oldIndex, newIndex);
            return checkIdElectricOfReceipt(receipt);
        }
        return false;
    }

    private boolean checkIdElectricOfReceipt(Receipt receipt) {
        HashSet<Integer> integers = new HashSet<>(receipts.keySet());
        if (integers.add(receipt.getIdElectric())) {
            receipts.put(receipt.getIdElectric(), receipt);
            return true;
        } else {
            return false;
        }
    }

    public void displayAll() {
        for (Receipt receipt : receipts.values()) {
            System.out.println(receipt);
        }
    }

    public void getElectricBillByIdElectric(int idElectric) {
        Receipt receipt = null;
        for (Receipt r : receipts.values()) {
            if (r.getIdElectric() == idElectric) {
                receipt = r;
            }
        }
        if (receipt == null) {
            System.err.println("Không tìm thấy !");
        } else {
            System.out.println("Gia đình ông/bà " + receipt.getName() + " phải thanh toán:");
            System.out.println(receipt.getElectricBill());
        }
    }

    public void writeReceiptToFile(HashMap<Integer, Receipt> receipts, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(receipts);
        objectOutputStream.close();
        System.out.println("Write successfully!");
    }

    public HashMap<Integer, Receipt> readReceiptsFromFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        return (HashMap<Integer, Receipt>) objectInputStream.readObject();
    }
}
