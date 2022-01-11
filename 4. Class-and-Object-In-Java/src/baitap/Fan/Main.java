package baitap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("fan1: " + fan1.toString());
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        System.out.println("fan2: " + fan2.toString());
    }
}
