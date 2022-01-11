package thuchanh4.main;

import thuchanh4.manager.HumanManager;
import thuchanh4.manager.TownManager;
import thuchanh4.model.House;

import java.util.Scanner;

public class Main {
    private static final HumanManager humanManager = new HumanManager();
    private static final TownManager townManager = new TownManager();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int choice;
       do {
           System.out.println("MENU:");
           System.out.println("1. Quản lý Town");
           System.out.println("2. Quản lý Human");
           System.out.println("0. Exit");
           System.out.println("Nhập lựa chọn");
           choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   menuTown();
                   break;
               case 2:
                   menuHuman();
                   break;
           }
       } while (choice != 0);
    }

    public static void menuHuman() {
        int choice1;
        do {
            System.out.println("Menu Human:");
            System.out.println("1. Tạo 1 Human");
            System.out.println("2. Hiển thị tất cả Human");
            System.out.println("3. Hiển thị Human theo hộ gia đình");
            System.out.println("4. Hiển thị những người trên 80 tuổi");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn:");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println("Nhập vào số nhà:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    House house = townManager.getHouseNumber(num);
                    if (house != null) {
                        System.out.println(humanManager.createHuman(house));
                    } else {
                        System.err.println("Số nhà không tồn tại !");
                    }
                    break;
                case 2:
                    humanManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập vào số nhà:");
                    int num1 = scanner.nextInt();
                    humanManager.displayHumanOfHouse(num1);
                    break;
                case 4:
                    humanManager.displayHumanOver80();
                    break;
            }
        } while (choice1 != 0);
    }

    public static void menuTown() {
        int choice2;
        do {
            System.out.println("Menu Town:");
            System.out.println("1. Thêm hộ gia đình");
            System.out.println("2. Hiển thị hộ gia đình");
            System.out.println("3. Hiển thị tất cả hộ gia đình");
            System.out.println("0. Exit");
            choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println(townManager.createHouse());
                    break;
                case 2:
                    System.out.println("Nhập số nhà:");
                    int num = scanner.nextInt();
                    townManager.displayHouse(num);
                    break;
                case 3:
                    townManager.displayAll();
                    break;
            }
        } while (choice2 != 0);
    }
}
