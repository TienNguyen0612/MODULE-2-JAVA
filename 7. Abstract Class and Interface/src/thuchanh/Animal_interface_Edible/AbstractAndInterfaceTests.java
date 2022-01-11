package thuchanh.Animal_interface_Edible;

import thuchanh.Animal_interface_Edible.animal.Animal;
import thuchanh.Animal_interface_Edible.animal.Chicken;
import thuchanh.Animal_interface_Edible.animal.Tiger;
import thuchanh.Animal_interface_Edible.edible.Edible;
import thuchanh.Animal_interface_Edible.fruit.Apple;
import thuchanh.Animal_interface_Edible.fruit.Fruit;
import thuchanh.Animal_interface_Edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
