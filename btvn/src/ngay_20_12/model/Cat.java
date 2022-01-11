package ngay_20_12.model;

import ngay_20_12.action.Action;

public class Cat extends Animal implements Action {
    public Cat() {
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 8;
    }

    @Override
    public String makeSound() {
        return "meow meow...";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Run: %5d, makeSound: %5s", run(), makeSound());
    }
}
