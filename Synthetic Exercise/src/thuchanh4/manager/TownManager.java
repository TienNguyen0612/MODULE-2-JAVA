package thuchanh4.manager;

import thuchanh4.model.House;
import thuchanh4.model.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class TownManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<House> houses;

    public TownManager() {
        this.houses = new ArrayList<>();
    }

    public House createHouse() {
        System.out.println("Nhập số lượng người:");
        int amount = scanner.nextInt();
        System.out.println("Nhập vào số nhà:");
        int houseNumber = scanner.nextInt();
        for (House h : houses) {
            if (h.getHouseNumber() == houseNumber) {
                System.out.println("Trùng số nhà, nhập lại !");
                return null;
            }
        }
        House house = new House(amount, houseNumber);
        houses.add(house);
        return house;
    }

    public void displayHouse(int houseNumber) {
        House house = null;
        for (House h : houses) {
            if (h.getHouseNumber() == houseNumber) {
                house = h;
            }
        }
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("Số nhà không tồn tại !");
        }
    }

    public void displayAll() {
        for (House house : houses) {
            System.out.println(house);
        }
    }

    public House getHouseNumber(int houseNumber) {
        House house = null;
        for (House h : houses) {
            if (h.getHouseNumber() == houseNumber) {
                house = h;
            }
        }
        return house;
    }
}
