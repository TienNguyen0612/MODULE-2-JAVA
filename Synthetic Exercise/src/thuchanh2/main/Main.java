package thuchanh2.main;

import thuchanh2.manager.Manager;
import thuchanh2.model.Receipt;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static final String PATH_NAME = "src/thuchanh2/receipts";
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("MENU:");
                System.out.println("1. Add Customer");
                System.out.println("2. Display All");
                System.out.println("3. Display Electric Bill By IdElectric");
                System.out.println("4. Write Receipt To File");
                System.out.println("0. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        if (!manager.addReceipt()) {
                            System.out.println("idElectric bị trùng hoặc nhập sai chỉ số, mời nhập lại !");
                        }
                        break;
                    case 2:
                        manager.displayAll();
                        break;
                    case 3:
                        System.out.println("Enter idElectric:");
                        int idSearch = scanner.nextInt();
                        manager.getElectricBillByIdElectric(idSearch);
                        break;
                    case 4:
                        try {
                            HashMap<Integer, Receipt> receiptHashMap = manager.getReceipts();
                            manager.writeReceiptToFile(receiptHashMap, PATH_NAME);
                        } catch (IOException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                }
            } while (choice != 0);
    }
}
