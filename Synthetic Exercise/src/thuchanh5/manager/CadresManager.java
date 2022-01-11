package thuchanh5.manager;

import thuchanh5.model.Cadres;
import thuchanh5.model.Engineer;
import thuchanh5.model.Staff;
import thuchanh5.model.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class CadresManager {
    ArrayList<Cadres> cadresList;
    Scanner scanner = new Scanner(System.in);

    public CadresManager() {
        this.cadresList = new ArrayList<>();
    }

    public Cadres createCadres(int choice) {
        System.out.println("Nhập tên mới:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh(dd/mm/yyyy):");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Nhập vào level:");
                String level = scanner.nextLine();
                return new Worker(name, date, gender, address, level);
            case 2:
                System.out.println("Nhập vào ngành đào tạo:");
                String specialized = scanner.nextLine();
                return new Engineer(name, date, gender, address, specialized);
            case 3:
                System.out.println("Nhập vào công việc:");
                String work = scanner.nextLine();
                return new Staff(name, date, gender, address, work);
            case 4:
                return new Cadres(name, date, gender, address);
        }
        return null;
    }

    public void addCadres(Cadres cadres) {
        cadresList.add(cadres);
    }

    public void searchByName(String name) {
        Cadres cadres = null;
        for (Cadres c : cadresList) {
            if (c.getName().equals(name)) {
                System.out.println(c);
                cadres = c;
            }
        }
        if (cadres == null) {
            System.out.println("Không tìm thấy tên !");
        }
    }

    public void displayAll() {
        for (Cadres c : cadresList) {
            System.out.println(c);
        }
    }
}
