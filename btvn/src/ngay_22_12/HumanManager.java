package ngay_22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    private ArrayList<Human> humans;
    Scanner scanner = new Scanner(System.in);;

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public void add(Human human) {
        humans.add(human);
    }

    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public ArrayList<Human> displayByGender(String gender) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getGender().equalsIgnoreCase(gender)) {
                human.add(h);
            }
        }
        return human;
    }

    public Human displayByAgeUnder20() {
        for (Human human : humans) {
            if (human.getAge() < 20) {
                System.out.println(human);
            }
        }
        return null;
    }

    public Human deleteByName(String name) {
        Human human = new Human();
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human = h;
                break;
            }
        }
        humans.remove(human);
        return human;
    }

    public Human updateByName(String name) {
        Human human = null;
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human = h;
                break;
            }
        }
        if (human != null) {
            System.out.println("Nhập tuổi mới:");
            human.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập giới tính mới:");
            human.setGender(scanner.nextLine());
            System.out.println("Nhập địa chỉ mới:");
            human.setAddress(scanner.nextLine());
        }
        return human;
    }

    public Human displayAllByName(String name) {
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                System.out.println(human);
            }
        }
        return null;
    }

    public Human createHuman(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        String address = scanner.nextLine();
        return new Human(name, age, gender, address);
    }
}
