package thuchanh4.manager;

import thuchanh4.model.House;
import thuchanh4.model.Human;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Human> humans;

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public Human createHuman(House house) {
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh(dd-mm-yyyy):");
        String dob = scanner.next();
        LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        scanner.nextLine();
        System.out.println("Nhập vào nghề nghiệp:");
        String job = scanner.nextLine();
        Human human = new Human(name, dateOfBirth, job, house);
        humans.add(human);
        return human;
    }

    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public void displayHumanOfHouse(int numberHouse) {
        Human human = null;
        for (Human h : humans) {
            if (h.getHouse().getHouseNumber() == numberHouse) {
                human = h;
            }
        }
        if (human != null) {
            System.out.println(human);
        } else {
            System.out.println("Không tìm thấy gia đình này !");
        }
    }
    public void displayHumanOver80() {
        for (Human human : humans) {
            if ((LocalDate.now().getYear() - human.getDateOfBirth().getYear()) >= 80) {
                System.out.println(human);
            }
        }
    }
}