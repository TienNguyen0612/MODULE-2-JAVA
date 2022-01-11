package ngay_20_12.model;

import ngay_20_12.action.Action;

public class Mouse extends Animal implements Action {
    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 5;
    }

    @Override
    public String makeSound() {
        return "chít chít...";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Run: %5d, makeSound: %5s", run(), makeSound());
    }
}
