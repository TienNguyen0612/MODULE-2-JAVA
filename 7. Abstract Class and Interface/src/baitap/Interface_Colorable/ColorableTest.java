package baitap.Interface_Colorable;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square("Indigo",true,10);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(30, 20);
        shapes[3] = new Square(25);
        System.out.println("Pre-Colorable");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("------------------");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("The Area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                if (shape instanceof Square) {
                    ((Square) shape).howToColor();
                }
            } else {
                System.out.println("The Area: " + ((Rectangle) shape).getArea());
            }
        }
    }
}