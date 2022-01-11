package ngay_30_12.model;

public class Student extends Human {
    private double mathPoint;
    private double phyPoint;
    private double chePoint;

    public Student(int id, String name, int age, double mathPoint, double phyPoint, double chePoint) {
        super(id,name, age);
        this.mathPoint = mathPoint;
        this.phyPoint = phyPoint;
        this.chePoint = chePoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhyPoint() {
        return phyPoint;
    }

    public void setPhyPoint(double phyPoint) {
        this.phyPoint = phyPoint;
    }

    public double getChePoint() {
        return chePoint;
    }

    public void setChePoint(double chePoint) {
        this.chePoint = chePoint;
    }

    public double getAverage() {
        return (mathPoint + phyPoint + chePoint) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + super.getId() +
                ", name='" + super.getName() +
                ", age=" + super.getAge() +
                ", mathPoint=" + mathPoint +
                ", phyPoint=" + phyPoint +
                ", chePoint=" + chePoint +
                '}';
    }
}
