package thuchanh.Read_Write_Student_Binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Dương Văn Trung", "Bắc Ninh"));
        students.add(new Student(3, "Trần Tuấn Huấn", "Hải Dương"));
        students.add(new Student(4, "Nguyễn Hồng Nam", "Hà Nội"));
        students.add(new Student(5, "Lê Việt Hùng", "Hải Dương"));
        writeToFile("src/thuchanh/Read_Write_Student_Binary/student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("src/thuchanh/Read_Write_Student_Binary/student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
