package ngay_23_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm 1 sinh viên");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Tìm sinh viên theo id");
            System.out.println("4. Xóa sinh viên theo id");
            System.out.println("5. Sửa sinh viên theo id");
            System.out.println("6. Hiển thị danh sách sinh viên đã sắp xếp");
            System.out.println("7. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManager.createStudent(scanner);
                    studentManager.addStudent(student);
                    break;
                case 2:
                    studentManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập vào id muốn tìm:");
                    int idSearch = scanner.nextInt();
                    System.out.println(studentManager.searchById(idSearch));
                    break;
                case 4:
                    System.out.println("Nhập vào id muốn xóa:");
                    int idDelete = scanner.nextInt();
                    studentManager.deleteById(idDelete);
                    break;
                case 5:
                    System.out.println("Nhập vào id muốn sửa:");
                    int idUpdate = scanner.nextInt();
                    studentManager.updateById(idUpdate);
                    break;
                case 6:
                    studentManager.sortByAveragePoint();
                    break;
                case 7:
                    studentManager.findMaxAvgPoint();
                    break;
            }
        } while (choice != 0);
    }
}
