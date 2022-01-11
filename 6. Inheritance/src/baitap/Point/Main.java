package baitap.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(50.5f, 30);
        System.out.println(point2D);

        Point3D point3D = new Point3D(30, 40.5f, 64.5f);
        System.out.println(point3D);

        MovablePoint movablePoint = new MovablePoint(2,3,4.5,5.5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
