package ngay_22_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm 1 người");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Hiển thị tất cả Nam");
            System.out.println("4. Hiển thị tất cả Nữ");
            System.out.println("5. Hiển thị tất cả người dưới 20 tuổi");
            System.out.println("6. Xóa 1 người theo tên");
            System.out.println("7. Sửa 1 người theo tên");
            System.out.println("8. Hiển thị tất cả người theo tên");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Human human = humanManager.createHuman(scanner);
                    humanManager.add(human);
                    break;
                case 2:
                    humanManager.displayAll();
                    break;
                case 3:
                    System.out.println(humanManager.displayByGender("Male"));
                    break;
                case 4:
                    System.out.println(humanManager.displayByGender("Female"));
                    break;
                case 5:
                    humanManager.displayByAgeUnder20();
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn xóa:");
                    String deleteName = scanner.nextLine();
                    humanManager.deleteByName(deleteName);
                    break;
                case 7:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn sửa:");
                    String editName = scanner.nextLine();
                    humanManager.updateByName(editName);
                    break;
                case 8:
                    scanner.nextLine();
                    System.out.println("Nhập tên muốn tìm:");
                    String searchName = scanner.nextLine();
                    humanManager.displayAllByName(searchName);
                    break;
            }
        } while (choice != 0);
    }
}
