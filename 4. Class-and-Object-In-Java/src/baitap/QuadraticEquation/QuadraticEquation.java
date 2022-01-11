package baitap.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
         return (b * b - 4 * a * c);
    }

    public double getX1() {
        return (- b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getX2() {
        return (- b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void result() {
        if (a == 0) {
            System.out.println("Giải phương trình bậc 1");
        } else {
            if (getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x = " + (- b / (2 * a)));
            } else {
                System.out.println("Phương trình có 2 nghiệm x1 = " + getX1() + ", x2 = " + getX2());
            }
        }
    }
}
