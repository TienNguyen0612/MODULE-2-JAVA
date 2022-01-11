package baitap.circle;

import baitap.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        circle.radius = 2;
        circle.color = "blue";
        System.out.printf("%.2f", circle.getArea());
    }
}
