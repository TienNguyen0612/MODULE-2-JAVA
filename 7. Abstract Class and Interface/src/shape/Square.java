package shape;

import baitap.Interface_Colorable.Colorable;
import baitap.Interface_Resizeable.Resizeable;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with side=" +
                getSide() +
                ", which is a subclass of " +
                super.toString();
    }
}
