package ngay_23_12;

public class Student extends Human {
    private double pointMath;
    private double pointPhysic;
    private double pointChemistry;
    private double pointAverage;

    public Student() {
    }

    public Student(String name, int age, double pointMath, double pointPhysic, double pointChemistry) {
        super(name, age);
        this.pointMath = pointMath;
        this.pointPhysic = pointPhysic;
        this.pointChemistry = pointChemistry;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointPhysic() {
        return pointPhysic;
    }

    public void setPointPhysic(double pointPhysic) {
        this.pointPhysic = pointPhysic;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public double getPointAverage() {
        return (pointMath + pointPhysic + pointChemistry) / 3;
    }

    public void setPointAverage(double pointAverage) {
        this.pointAverage = pointAverage;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", pointMath=" + pointMath +
                ", pointPhysic=" + pointPhysic +
                ", pointChemistry=" + pointChemistry +
                '}';
    }
}
