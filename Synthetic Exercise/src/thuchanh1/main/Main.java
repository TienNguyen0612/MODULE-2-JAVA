package thuchanh1.main;

import thuchanh1.manager.HotelManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        Scanner scanner =new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thuê phòng");
            System.out.println("2. Hiển thị khách đang ở");
            System.out.println("3. Xóa khách theo CMND");
            System.out.println("4. Tìm khách theo tên");
            System.out.println("5. Khách Check out");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hotelManager.add();
                    break;
                case 2:
                    System.out.printf("%-15S%-15s%-15S%-15s%-15s%-15s", "Tên", "Ngày sinh", "CMND", "Số ngày thuê", "Loại phòng", "Giá phòng");
                    hotelManager.displayALL();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập số CMND muốn xóa:");
                    String idCardDelete = scanner.nextLine();
                    hotelManager.deleteByIdCard(idCardDelete);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập tên khách hàng:");
                    String searchName = scanner.nextLine();
                    System.out.printf("%-15S%-15s%-15S%-15s%-15s%-15s", "Tên", "Ngày sinh", "CMND", "Số ngày thuê", "Loại phòng", "Giá phòng");
                    hotelManager.searchByName(searchName);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập số CMND khách muốn Check out:");
                    String idCardOut = scanner.nextLine();
                    hotelManager.totalMoneyByIdCard(idCardOut);
                    break;
            }
        } while (choice != 0);
    }
}
