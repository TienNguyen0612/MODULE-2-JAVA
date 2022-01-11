package thuchanh.Factory_Method_TH;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("dog");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("cat");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
