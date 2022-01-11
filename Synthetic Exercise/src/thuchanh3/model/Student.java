package thuchanh3.model;

public class Student {
    private String name;
    private String idStudent;
    private String dateOfBirth;
    private String className;

    public Student() {
    }

    public Student(String name, String idStudent, String dateOfBirth, String className) {
        this.name = name;
        this.idStudent = idStudent;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idStudentCard='" + idStudent + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
