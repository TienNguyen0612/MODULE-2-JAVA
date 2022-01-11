package ngay_20_12.manager;

import ngay_20_12.model.Animal;
import ngay_20_12.model.Cat;
import ngay_20_12.model.Dog;
import ngay_20_12.model.Mouse;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AnimalManager {
    private Set<Animal> animals;
    private final Scanner scanner = new Scanner(System.in);

    public AnimalManager() {
        this.animals = new LinkedHashSet<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal deleteByName(String name) {
        animals.removeIf(animal -> animal.getName().equals(name));
        System.out.println("Xóa thành công !");
        return null;
    }

    public Animal updateByName(String name) {
        Animal animalUpdate = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animalUpdate = animal;
            }
        }

        if (animalUpdate != null) {
            System.out.println("Nhập tuổi mới:");
            animalUpdate.setAge(scanner.nextInt());
            System.out.println("Nhập cân nặng mới:");
            animalUpdate.setWeight(scanner.nextDouble());
            scanner.nextLine();
            return animalUpdate;
        }
        return null;
    }

    public Animal searchByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void displayAllDogs() {
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println(animal);
            }
        }
    }

    public void displayAnimalByWeight(double weight1, double weight2) {
        boolean check = false;
        for (Animal animal : animals) {
            if (animal.getWeight() >= weight1 && animal.getWeight() <= weight2) {
                System.out.println(animal);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy con nào !");
        }
    }

    public Animal creatAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào cân nặng:");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        switch (choice) {
            case 1:
                return new Animal(name, age, weight);
            case 2:
                return new Dog(name, age, weight);
            case 3:
                return new Cat(name, age, weight);
            case 4:
                return new Mouse(name, age, weight);
        }
        return null;
    }
}
