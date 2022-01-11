package ngay_23_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student createStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm Toán:");
        double pointMath = scanner.nextDouble();
        System.out.println("Nhập vào điểm Vật Lý:");
        double pointPhysic = scanner.nextDouble();
        System.out.println("Nhập vào điểm Hóa Học:");
        double pointChemistry = scanner.nextDouble();
        return new Student(name, age, pointMath, pointPhysic, pointChemistry);
    }

    public Student searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student deleteById(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student == null) {
            System.out.println("Không tìm thấy id !");
        } else {
            students.remove(student);
            System.out.println("Xóa thành công !");
        }
        return student;
    }

    public Student updateById(int id) {
        Student studentUpdate = null;
        for (Student s : students) {
            if (s.getId() == id) {
                studentUpdate = s;
            }
        }
        if (studentUpdate != null) {
            System.out.println("Nhập vào tên mới:");
            studentUpdate.setName(scanner.nextLine());
            System.out.println("Nhập vào tuổi mới:");
            studentUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập vào điểm Toán mới:");
            studentUpdate.setPointMath(scanner.nextDouble());
            System.out.println("Nhập vào điểm Vật Lý mới:");
            studentUpdate.setPointPhysic(scanner.nextDouble());
            System.out.println("Nhập vào điểm Hóa Học mới:");
            studentUpdate.setPointChemistry(scanner.nextDouble());
            return studentUpdate;
        }
        return null;
    }

    public void sortByAveragePoint() {
        students.sort((o1, o2) -> {
            if (o1.getPointAverage() < o2.getPointAverage()) return 1;
            else if (o1.getPointAverage() > o2.getPointAverage()) return -1;
            return 0;
        });
        System.out.println("Sắp xếp thành công !");
    }

    public Student findMaxAvgPoint() {
        double maxAvg = 0;
        for (Student student : students) {
            if (maxAvg < student.getPointAverage()) {
                maxAvg = student.getPointAverage();
            }
        }
        for (Student student : students) {
            if (student.getPointAverage() == maxAvg) {
                System.err.println(student);
            }
        }
        return null;
    }
}
