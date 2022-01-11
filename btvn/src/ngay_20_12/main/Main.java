package ngay_20_12.main;

import ngay_20_12.manager.AnimalManager;
import ngay_20_12.model.Animal;
import ngay_20_12.model.Cat;
import ngay_20_12.model.Dog;
import ngay_20_12.model.Mouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Thêm một con vật");
            System.out.println("2. Xóa một con vật theo tên");
            System.out.println("3. Sửa một con vật theo tên");
            System.out.println("4. Hiển thị thông tin con vật theo tên");
            System.out.println("5. Hiển thị tất cả con vật");
            System.out.println("6. Hiển thị tất cả Dogs");
            System.out.println("7. Tìm các con vật theo cân nặng");
            System.out.println("0. Exit");
            System.err.println("Nhập lựa chọn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Animal");
                        System.out.println("2. Dog");
                        System.out.println("3. Cat");
                        System.out.println("4. Mouse");
                        System.out.println("0. Exit");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Animal animal = animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(animal);
                                break;
                            case 2:
                                Dog dog = (Dog) animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(dog);
                                break;
                            case 3:
                                Cat cat = (Cat) animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(cat);
                                break;
                            case 4:
                                Mouse mouse = (Mouse) animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(mouse);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Nhập tên con vật muốn xóa:");
                    String nameDelete = scanner.nextLine();
                    System.out.println(animalManager.deleteByName(nameDelete));
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Nhập tên con vật muốn sửa:");
                    String name = scanner.nextLine();
                    System.out.println(animalManager.updateByName(name));
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Nhập tên con vật muốn tìm:");
                    String nameSearch = scanner.nextLine();
                    System.out.println(animalManager.searchByName(nameSearch));
                    break;
                case 5:
                    animalManager.displayAll();
                    break;
                case 6:
                    animalManager.displayAllDogs();
                    break;
                case 7:
                    System.out.println("Nhập vào cân nặng dưới:");
                    double weight1 = scanner.nextDouble();
                    System.out.println("Nhập vào cân nặng trên:");
                    double weight2 = scanner.nextDouble();
                    animalManager.displayAnimalByWeight(weight1, weight2);
                    break;
            }
        } while (choice != 0);
    }
}
