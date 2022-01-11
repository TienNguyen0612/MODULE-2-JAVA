package ngay_30_12.main;

import ngay_30_12.manager.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All");
            System.out.println("6. Display Students By Average Increase");
            System.out.println("7. Display Students By Average Decrease");
            System.out.println("8. Display Students Have Max Point");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Enter Id:");
                    int idUpdate = scanner.nextInt();
                    studentManager.editStudent(idUpdate);
                    break;
                case 3:
                    System.out.println("Enter Id:");
                    int idDelete = scanner.nextInt();
                    studentManager.deleteStudent(idDelete);
                    break;
                case 4:
                    System.out.println("Enter Id:");
                    int idSearch = scanner.nextInt();
                    studentManager.searchById(idSearch);
                    break;
                case 5:
                    studentManager.displayAll();
                    break;
                case 6:
                    studentManager.sortByAverageIncrease();
                    break;
                case 7:
                    studentManager.sortByAverageDecrease();
                    break;
                case 8:
                    studentManager.getStudentsByMaxAverage();
                    break;
            }
        } while (choice != 0);
    }
}
