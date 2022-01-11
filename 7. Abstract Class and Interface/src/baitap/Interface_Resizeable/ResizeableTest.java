package baitap.Interface_Resizeable;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5);
        shapes[1] = new Rectangle(20, 30);
        shapes[2] = new Square(50);
        System.out.println("Pre-resizeable");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("-------------");
        System.out.println("After-resizeable");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.floor(Math.random()*100 + 1));
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.floor(Math.random()*100 + 1));
            }
            System.out.println(shape);
        }
    }
}
