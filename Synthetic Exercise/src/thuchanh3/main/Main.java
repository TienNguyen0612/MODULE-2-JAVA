package thuchanh3.main;

import thuchanh3.manager.BookCardManager;
import thuchanh3.manager.StudentManager;
import thuchanh3.model.Student;

import java.util.Scanner;

public class Main {
    private static final StudentManager studentManager = new StudentManager();
    private static final BookCardManager bookCardManager = new BookCardManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     int choice;
     do {
         System.out.println("Menu:");
         System.out.println("1. Quản lý Student");
         System.out.println("2. Quản lý BookCard");
         System.out.println("0. Exit");
         System.out.println("Enter your choice:");
         choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 menuStudent();
                 break;
             case 2:
                 menuBookCard();
                 break;
         }
     } while (choice != 0);
    }

    public static void menuStudent() {
        int choice1;
        do {
            System.out.println("MENU Student:");
            System.out.println("1. Tạo Student");
            System.out.println("2. Hiển thị Student theo idStudent");
            System.out.println("3. Hiển thị tất cả Student");
            System.out.println("4. Xóa Student theo idStudent");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println(studentManager.createStudent());
                    break;
                case 2:
                    System.out.println("Nhập vào idStudent:");
                    String idSearch = scanner.next();
                    studentManager.displayStudent(idSearch);
                    break;
                case 3:
                    studentManager.displayAll();
                    break;
                case 4:
                    System.out.println("Nhập vào idStudent:");
                    String idDelete = scanner.next();
                    studentManager.deleteStudent(idDelete);
                    break;
            }
        } while (choice1 != 0);
    }

    public static void menuBookCard() {
        int choice2;
        do {
            System.out.println("MENU BookCard:");
            System.out.println("1. Mượn sách");
            System.out.println("2. Hiển thị các sinh viên mượn sách");
            System.out.println("3. Hiển thị các quyển sách sinh viên mượn");
            System.out.println("4. Xem ngày trả sách");
            System.out.println("5. Hiển thị sinh viên đến hạn phải trả sách");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Nhập vào idStudent muốn mượn sách:");
                    String id1 = scanner.next();
                    Student student = studentManager.getStudent(id1);
                    if (student != null) {
                        System.out.println(bookCardManager.createBookCard(student));
                    } else {
                        System.out.println("Student trên không tồn tại !");
                    }
                    break;
                case 2:
                    bookCardManager.displayStudents();
                    break;
                case 3:
                    System.out.println("Nhập vào idStudent:");
                    String id2 = scanner.next();
                    bookCardManager.displayBookOfStudent(id2);
                    break;
                case 4:
                    System.out.println("Nhập vào idStudent:");
                    String id3 = scanner.next();
                    bookCardManager.endDate(id3);
                    break;
                case 5:
                    bookCardManager.displayStudentOutOfDate();
                    break;
            }
        } while (choice2 != 0);
    }
}
