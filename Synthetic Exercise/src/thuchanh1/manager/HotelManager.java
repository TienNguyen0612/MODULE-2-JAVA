package thuchanh1.manager;

import thuchanh1.model.Hotel;
import thuchanh1.model.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HotelManager {
    private HashMap<Human, Hotel> lists;
    Scanner scanner = new Scanner(System.in);

    public HotelManager() {
        lists = new HashMap<>();
    }

    public void add() {
        try {
            scanner.nextLine();
            System.out.println("Nhập vào tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập vào ngày dd/mm/yyy:");
            String birthDate = scanner.nextLine();
            System.out.println("Nhập vào CMND:");
            String idCard = scanner.nextLine();
            System.out.println("Nhập vào số ngày ở:");
            int days = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào loại phòng:");
            String type = scanner.nextLine();
            System.out.println("Nhập vào giá phòng:");
            int price = scanner.nextInt();
            Human human = new Human(name, birthDate, idCard);
            Hotel hotel = new Hotel(days, type, price);
            lists.put(human, hotel);
        } catch (Exception e) {
            System.out.println("Nhập lỗi rồi, xin mời nhập lại !");
            scanner.nextLine();
            add();
        }
    }

    public void displayALL() {
            Set<Map.Entry<Human, Hotel>> sets = lists.entrySet();
            for (Map.Entry<Human, Hotel> s : sets) {
                s.getKey().displayHuman();
                s.getValue().displayHotel();
            }
    }

    public Human deleteByIdCard(String idCard) {
        Human human1;
        for (Human h : lists.keySet()) {
            if (h.getIdCard().equals(idCard)) {
                human1 = h;
                lists.remove(h);
                System.out.println("Xóa thành công !");
                return human1;
            }
        }
        return null;
    }

    public void searchByName(String name) {
        boolean check = true;
        for (Map.Entry<Human, Hotel> h : lists.entrySet()) {
            if (h.getKey().getName().equals(name)) {
                h.getKey().displayHuman();
                h.getValue().displayHotel();
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên !");
        }
    }

    public void totalMoneyByIdCard(String idCard) {
        boolean check = true;
        for (Map.Entry<Human, Hotel> h : lists.entrySet()) {
            if (h.getKey().getIdCard().equals(idCard)) {
                System.out.println("Tổng tiền là: " + h.getValue().getDaysStayIn() * h.getValue().getPrice());
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy CMND !");
        }
    }
}
