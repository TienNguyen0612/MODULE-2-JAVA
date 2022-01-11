package baitap.student;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double pointMath;
    private double pointLit;
    private double pointEng;

    public Student() {}

    public Student(String name, int age, String gender, String address, double pointMath, double pointLit, double pointEng) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pointMath = pointMath;
        this.pointLit = pointLit;
        this.pointEng = pointEng;
    }

    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointLit() {
        return pointLit;
    }

    public void setPointLit(double pointLit) {
        this.pointLit = pointLit;
    }

    public double getPointEng() {
        return pointEng;
    }

    public void setPointEng(double pointEng) {
        this.pointEng = pointEng;
    }

    public double averagePoint() {
        return (this.pointMath + this.pointLit + this.pointEng) / 3;
    }

    public String getAverage() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + averagePoint() + '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", pointMath=" + pointMath +
                ", pointLit=" + pointLit +
                ", pointEng=" + pointEng +
                '}';
    }
}
