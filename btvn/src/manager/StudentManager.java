package manager;

import model.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager implements Comparator<Student> {
    public Student[] students;
    public static int index = 0;
    public int id = 1;

    public StudentManager() {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        StudentManager.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    //Thêm sinh viên
    public void createStudent(Scanner scanner) {
        System.out.println("Nhập tên sinh viên:");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double averagePoint = scanner.nextDouble();
        Student student = new Student(name, age, gender, address, averagePoint, id);
        if (index == students.length) {
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[index] = student;
        index++;
        id++;
    }

    //Hiển thị tất cả sinh viên
    public void displayStudent() {
        System.out.println("Danh sách sinh viên là:");
        for (Student student : students) {
            boolean compareNull = student != null;
            if (compareNull)
                System.out.println(student);
        }
        System.out.println("----------------");
    }

    //Tìm sinh viên có điểm trung bình cao nhất
    public void findMaxAveragePoint() {
        double maxAveragePoint = students[0].getAveragePoint();
        for (Student student : students) {
            if (student != null && maxAveragePoint < student.getAveragePoint()) {
                maxAveragePoint = student.getAveragePoint();
            }
        }
        System.out.println("Những sinh viên có điểm trung bình cao nhất:");
        for (Student student : students) {
            if (student != null && student.getAveragePoint() == maxAveragePoint)
                System.out.println(student);
        }
        System.out.println("----------------");
    }

    //Tìm sinh viên có điểm trung bình thấp nhất
    public void findMinAveragePoint() {
        double minAveragePoint = students[0].getAveragePoint();
        for (Student student : students) {
            if (student != null && minAveragePoint > student.getAveragePoint()) {
                minAveragePoint = student.getAveragePoint();
            }
        }
        System.out.println("Những sinh viên có điểm trung bình thấp nhất:");
        for (Student student : students) {
            if (student != null && student.getAveragePoint() == minAveragePoint)
                System.out.println(student);
        }
        System.out.println("----------------");
    }

    //Xóa sinh viên theo tên
    public void deleteStudent(Scanner scanner) {
        System.out.println("Nhập tên sinh viên muốn xóa:");
        String deletedName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && deletedName.equalsIgnoreCase(students[i].getName())) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
            }
        }
        index--;
        for (Student student : students) {
            if (student != null)
                System.out.println(student);
        }
        System.out.println("----------------");
    }

    //Tìm kiếm sinh viên theo tên
    public void searchByName(Scanner scanner) {
        boolean check = false;
        System.out.println("Nhập tên sinh viên muốn tìm:");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equals(name)) {
                    check = true;
                    System.out.println(student);
                }
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tên !!!");
        }
        System.out.println("----------------");
    }

    //Hiển thị tất cả sinh viên theo giới tính
    public void displayStudentByGender(Scanner scanner) {
        int choice;
        do {
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("0. Exit");
            System.out.println("----------------");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            if (choice < 0 || choice > 2)
                System.out.println("Wrong !!!");
            else if (choice == 1) {
                for (Student student : students) {
                    if (student != null && "male".equalsIgnoreCase(student.getGender()))
                        System.out.println(student);
                }
            } else {
                for (Student student : students) {
                    if (student != null && student.getGender().equalsIgnoreCase("female"))
                        System.out.println(student);
                }
            }
        } while (choice != 0);
        System.out.println("----------------");
    }

    //Sắp xếp điểm trung bình tăng dần
    public void sortAveragePointStudentIncrease() {
        System.out.println("Danh sách sinh viên là:");
        Comparator<Student> studentComparator = new StudentManager();
        Arrays.sort(students, studentComparator);
        for (Student student : students) {
            if (student != null)
                System.out.println(student);
        }
        System.out.println("----------------");
    }

    public int compare(Student s1, Student s2) {
        if (s1 != null && s2 != null) {
            if (s1.getAveragePoint() > s2.getAveragePoint()) return 1;
            else if (s1.getAveragePoint() < s2.getAveragePoint()) return -1;
            else return 0;
        }
        return 0;
    }

    //Sửa thông tin sinh viên theo id
    public void editStudent(Scanner scanner) {
        System.out.println("Nhập Id của sinh viên muốn sửa:");
        int editedId = scanner.nextInt();
        for (Student student : students) {
            if (student != null && student.getId() == editedId) {
                scanner.nextLine();
                System.out.println("Nhập tên sinh viên:");
                student.setName(scanner.nextLine());
                System.out.print("Nhập tuổi: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Nhập giới tính: ");
                student.setGender(scanner.nextLine());
                System.out.print("Nhập địa chỉ: ");
                student.setAddress(scanner.nextLine());
                System.out.print("Nhập điểm trung bình: ");
                student.setAveragePoint(scanner.nextDouble());
            }
        }
    }
}
