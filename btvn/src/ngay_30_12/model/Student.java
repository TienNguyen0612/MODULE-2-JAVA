package ngay_30_12.model;

public class Student extends Human {
    private double math;
    private double phy;
    private double che;

    public Student(int id, String name, int age, double math, double phy, double che) {
        super(id, name, age);
        this.math = math;
        this.phy = phy;
        this.che = che;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhy() {
        return phy;
    }

    public void setPhy(double phy) {
        this.phy = phy;
    }

    public double getChe() {
        return che;
    }

    public void setChe(double che) {
        this.che = che;
    }

    public double getAverage() {
        return (math + phy + che) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() +
                ", age=" + super.getAge() +
                ", math=" + math +
                ", phy=" + phy +
                ", che=" + che +
                '}';
    }
}
