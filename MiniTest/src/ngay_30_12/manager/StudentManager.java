package ngay_30_12.manager;

import ngay_30_12.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/ngay_30_12/students.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student addStudent() {
        System.out.println("Nhập vào id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm Toán:");
        double math = scanner.nextDouble();
        System.out.println("Nhập vào điểm Lý:");
        double phy = scanner.nextDouble();
        System.out.println("Nhập vào điểm Hóa:");
        double che = scanner.nextDouble();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Trùng mã sinh viên, mời nhập lại !!!");
                return null;
            }
        }
        Student student = new Student(id, name, age, math, phy, che);
        students.add(student);
        writeFile(students, PATH_NAME);
        System.out.println("Thêm sinh viên " + name + " thành công !!!");
        return student;
    }

    public Student editStudent(int id) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập vào tên mới:");
            editStudent.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới:");
            editStudent.setAge(scanner.nextInt());
            System.out.println("Nhập vào điểm Toán mới:");
            editStudent.setMathPoint(scanner.nextDouble());
            System.out.println("Nhập vào điểm Lý mới:");
            editStudent.setPhyPoint(scanner.nextDouble());
            System.out.println("Nhập vào điểm Hóa mới:");
            editStudent.setChePoint(scanner.nextDouble());
            students.set(index, editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Sửa sinh viên có mã " + id + " thành công !!!");
        }
        return editStudent;
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
            writeFile(students, PATH_NAME);
            System.out.println("Xóa sinh viên có mã " + id + " thành công !!!");
        }
        return student;
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchById(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Không tìm thấy sinh viên !!!");
        }
    }

    public void sortByAverageIncrease() {
        students.sort((o1, o2) -> Double.compare(o1.getAverage(),o2.getAverage()));
        students.forEach(System.out::println);
    }

    public void sortByAverageDecrease() {
        students.sort(((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage())));
        students.forEach(System.out::println);
    }

    public void getStudentsByMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double avg = students.get(0).getAverage();
        for (Student student : students) {
            if (student.getAverage() > avg) {
                avg = student.getAverage();
            }
        }
        for (Student student : students) {
            if (student.getAverage() == avg) {
                studentsMax.add(student);
            }
        }
        studentsMax.forEach(System.out::println);
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getAge()
                + "," + student.getMathPoint() + "," + student.getPhyPoint() + "," + student.getChePoint() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Write file successfully !!!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(Integer.parseInt(strings[0]),strings[1],Integer.parseInt(strings[2]),Double.parseDouble(strings[3]),Double.parseDouble(strings[4]),Double.parseDouble(strings[5])));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return students;
    }
}
