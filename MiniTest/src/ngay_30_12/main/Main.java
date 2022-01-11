package ngay_30_12.main;

import ngay_30_12.manager.StudentManager;
import ngay_30_12.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm sinh viên");
            System.out.println("5. Sắp xếp theo điểm tăng dần");
            System.out.println("6. Sắp xếp theo điểm giảm dần");
            System.out.println("7. Tìm sinh viên điểm cao nhất");
            System.out.println("8. Đọc file");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập id muốn sửa:");
                    int idEdit = scanner.nextInt();
                    studentManager.editStudent(idEdit);
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa:");
                    int idDelete = scanner.nextInt();
                    studentManager.deleteStudent(idDelete);
                    break;
                case 4:
                    System.out.println("Nhập id muốn tìm:");
                    int idSearch = scanner.nextInt();
                    studentManager.searchById(idSearch);
                    break;
                case 5:
                    studentManager.sortByAverageIncrease();
                    break;
                case 6:
                    studentManager.sortByAverageDecrease();
                    break;
                case 7:
                    studentManager.getStudentsByMaxPoint();
                    break;
                case 8:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
                case 9:
                    studentManager.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}