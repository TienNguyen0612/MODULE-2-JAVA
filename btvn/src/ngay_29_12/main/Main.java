package ngay_29_12.main;

import ngay_29_12.manager.StudentManager;
import ngay_29_12.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display All");
            System.out.println("5. Display All Students have AveragePoint Over 7.5");
            System.out.println("6. Display All Students in Format ");
            System.out.println("7. Write File");
            System.out.println("8. Read File");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập vào tên muốn xóa:");
                    String deleteName = scanner.nextLine();
                    studentManager.deleteStudent(deleteName);
                    break;
                case 3:
                    System.out.println("Nhập vào tên muốn sửa:");
                    String updateName = scanner.nextLine();
                    studentManager.editStudent(updateName);
                    break;
                case 4:
                    System.out.println("All Students");
                    studentManager.displayAll();
                    break;
                case 5:
                    System.out.println("All Students By AveragePoint");
                    studentManager.displayStudentByAverage();
                    break;
                case 6:
                    System.out.println("All Students in Format");
                    studentManager.displayStudentFormat();
                    break;
                case 7:
                    studentManager.writeFile(studentManager.getStudents(), StudentManager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
