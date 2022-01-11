package thuchanh.Factory_Method_TH;

public class AnimalFactory {
    public Animal getAnimal(String name) {
        if ("dog".equals(name)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
