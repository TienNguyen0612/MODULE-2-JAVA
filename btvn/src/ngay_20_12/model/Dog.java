package ngay_20_12.model;

import ngay_20_12.action.Action;

public class Dog extends Animal implements Action {
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "gâu gâu...";
    }

    public void catchCat() {

    }

    @Override
    public String toString() {
        return super.toString() + String.format("Run: %5d, makeSound: %5s", run(), makeSound());
    }
}
