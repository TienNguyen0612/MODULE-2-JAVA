package thuchanh3.manager;

import thuchanh3.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public Student createStudent() {
        System.out.println("Nhập vào tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào mã sinh viên:");
        String idStudent = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh dd/mm/yyyy:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập vào lớp:");
        String className = scanner.nextLine();
        for (Student s : students) {
            if (s.getIdStudent().equals(idStudent)) {
                System.out.println("Trùng mã sinh viên, nhập lại !");
                return null;
            }
        }
        Student student = new Student(name, idStudent, dateOfBirth, className);
        students.add(student);
        return student;
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStudent(String idStudent) {
        Student student = null;
        for (Student s : students) {
            if (s.getIdStudent().equals(idStudent)) {
                student = s;
            }
        }
        if (student != null) {
            System.out.println(student);
        } else {
            System.err.println("idStudent không tồn tại !");
        }
    }

    public void deleteStudent(String idStudent) {
        Student student = null;
        for (Student s : students) {
            if (s.getIdStudent().equals(idStudent)) {
                student = s;
            }
        }
        boolean check = students.remove(student);
        if (check) {
            System.out.println("Xóa thành công !");
        } else {
            System.err.println("Không tìm thấy !");
        }
    }

    public Student getStudent(String idStudent) {
        Student student = null;
        for (Student s : students) {
            if (s.getIdStudent().equals(idStudent)) {
                student = s;
            }
        }
        return student;
    }
}
