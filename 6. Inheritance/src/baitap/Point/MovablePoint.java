package baitap.Point2D;

public class MovablePoint extends Point2D {
    private double xSpeed = 0;
    private double ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public double[] getSpeed() {
        double[] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    public MovablePoint move() {
//        double x = super.getX();
//        double y = super.getY();
//        x += xSpeed;
//        y += ySpeed;
        setxSpeed(getX() + xSpeed);
        setySpeed(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{ x=" + getX() +
                ", y=" + getY() +
                ", xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() + "}";
    }
}
