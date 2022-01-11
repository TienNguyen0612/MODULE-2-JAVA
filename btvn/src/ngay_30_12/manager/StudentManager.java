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

    public boolean checkStudentByAgeAndAverage(int age, double math, double phy, double che) {
        return (age > 18 && age < 60 && math >= 0 && phy >= 0 && che >= 0 && math <= 10 && phy <= 10 & che <= 10);
    }

    public Student addStudent() {
        System.out.println("Enter Id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println("Enter Math Point:");
        double math = scanner.nextDouble();
        System.out.println("Enter Physics Point:");
        double phy = scanner.nextDouble();
        System.out.println("Enter Chemistry Point:");
        double che = scanner.nextDouble();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Id is the same, Please try again !!!");
                return null;
            }
        }
        Student student = new Student(id, name, age, math, phy, che);
        if (checkStudentByAgeAndAverage(age, math, phy, che)) {
            students.add(student);
            writeFile(students, PATH_NAME);
            System.out.println("Add the Student " + name + " successfully !!!");
        } else {
            System.out.println("Data entry error, Please try again !!!");
        }
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
            System.out.println("Enter New Name:");
            editStudent.setName(scanner.nextLine());
            System.out.println("Enter New Age:");
            editStudent.setAge(scanner.nextInt());
            System.out.println("Enter New Math Point:");
            editStudent.setMath(scanner.nextDouble());
            System.out.println("Enter New Physics Point:");
            editStudent.setPhy(scanner.nextDouble());
            System.out.println("Enter New Chemistry Point:");
            editStudent.setChe(scanner.nextDouble());
            students.set(index, editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Edit the Student Id " + id + " successfully !!!");
        } else {
            System.out.println("Don't search this Id !!!");
        }
        return editStudent;
    }

    public Student deleteStudent(int id) {
        Student deleteStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                deleteStudent = student;
            }
        }
        if (deleteStudent != null) {
            students.remove(deleteStudent);
            writeFile(students, PATH_NAME);
        } else {
            System.out.println("Don't search this Id !!!");
        }
        return deleteStudent;
    }

    public void searchById(int id) {
        Student searchStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                searchStudent = student;
            }
        }
        if (searchStudent != null) {
            System.out.println(searchStudent);
        } else {
            System.out.println("Don't search this Id");
        }
    }

    public void displayAll() {
        students.sort((o1, o2) -> Integer.compare(o1.getId(),o2.getId()));
        students.forEach(System.out::println);
        writeFile(students,PATH_NAME);
    }

    public ArrayList<Student> sortByAverageIncrease() {
        students.sort((o1, o2) -> Double.compare(o1.getAverage(), o2.getAverage()));
        students.forEach(System.out::println);
        return students;
    }

    public ArrayList<Student> sortByAverageDecrease() {
        students.sort((o1, o2) -> Double.compare(o2.getAverage(), o1.getAverage()));
        students.forEach(System.out::println);
        return students;
    }

    public ArrayList<Student> getStudentsByMaxAverage() {
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
        return studentsMax;
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getAge() + ","
                        + student.getMath() + "," + student.getPhy() + "," + student.getChe() + "\n");
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
                students.add(new Student(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4]), Double.parseDouble(strings[5])));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return students;
    }
}
