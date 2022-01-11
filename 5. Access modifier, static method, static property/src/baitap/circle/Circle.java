package baitap.circle;

public class Circle {
    protected double radius = 1;
    protected String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

//    public double getRadius() {
//        return radius;
//    }

    protected double getRadius() { return radius; }

    double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}
