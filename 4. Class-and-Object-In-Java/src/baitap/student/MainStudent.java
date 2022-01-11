package baitap.student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        Student student1 = new Student("Nam", 20, "Male", "HN");
        Student student2 = new Student("Hùng", 18, "Male", "HN", 5, 6, 7);
        Student student3 = new Student("Huấn", 24, "Female", "HN", 4, 4, 4);
        Student student4 = createStudent(sc);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------");

        //thay đổi điểm
        inputPoints(sc, student1);
        inputPoints(sc, student2);

//        for (Student student : students) {
//            System.out.println(student.getAverage());
//        }

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------");

        //Sắp xếp array tăng dần
//        for (int i = 0; i < students.length - 1; i++) {
//            for (int j = i + 1; j < students.length; j++) {
//                if (students[i].averagePoint() > students[j].averagePoint()) {
//                    Student temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
        //Display name + average tăng dần
//        for (Student student : students) {
//            System.out.println(student.getAverage());
//        }

        //Creat student
    }

    public static void inputPoints(Scanner scanner, Student student) {
        if (student.getName().equals("Nam")) {
            System.out.println("Nhập điểm Toán:");
            student.setPointMath(scanner.nextDouble());
            System.out.println("Nhập điểm Văn:");
            student.setPointLit(scanner.nextDouble());
            System.out.println("Nhập điểm Anh:");
            student.setPointEng(scanner.nextDouble());
        }
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm Toán:");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Văn:");
        double lit = scanner.nextDouble();
        System.out.println("Nhập điểm Anh:");
        double eng = scanner.nextDouble();
        return new Student(name, age, gender, address, math, lit, eng);
    }
}
