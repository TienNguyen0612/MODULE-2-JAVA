package main;

import manager.StudentManager;
import model.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên muốn tạo:");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManager studentManager = new StudentManager(students);

        int choice;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("|                         MENU:                          |");
            System.out.println("| 1. Thêm sinh viên                                      |");
            System.out.println("| 2. Hiển thị tất cả sinh viên                           |");
            System.out.println("| 3. Hiển thị sinh viên có điểm cao nhất                 |");
            System.out.println("| 4. Hiển thị sinh viên có điểm thấp nhất                |");
            System.out.println("| 5. Xóa sinh viên                                       |");
            System.out.println("| 6. Tìm kiếm sinh viên theo tên                         |");
            System.out.println("| 7. Hiển thị tất cả sinh viên theo giới tính            |");
            System.out.println("| 8. Sắp xếp các sinh viên theo điểm trung bình tăng dần |");
            System.out.println("| 9. Sửa thông tin sinh viên theo Id                     |");
            System.out.println("| 0. Exit                                                |");
            System.out.println("----------------------------------------------------------");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManager.createStudent(scanner);
                    break;
                case 2:
                    studentManager.displayStudent();
                    break;
                case 3:
                    studentManager.findMaxAveragePoint();
                    break;
                case 4:
                    studentManager.findMinAveragePoint();
                    break;
                case 5:
                    studentManager.deleteStudent(scanner);
                    break;
                case 6:
                    studentManager.searchByName(scanner);
                    break;
                case 7:
                    studentManager.displayStudentByGender(scanner);
                    break;
                case 8:
                    studentManager.sortAveragePointStudentIncrease();
                    break;
                case 9:
                    studentManager.editStudent(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
