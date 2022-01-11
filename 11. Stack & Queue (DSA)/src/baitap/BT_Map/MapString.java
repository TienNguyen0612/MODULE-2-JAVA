package baitap.BT_Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine().trim().toUpperCase();
        String[] strings = string.split("\\s");

        HashMap<String, Integer> customers = new HashMap<>();

        addKey(strings, customers);
        display(customers);

    }

    private static void addKey(String[] strings, HashMap<String, Integer> customers) {
        for (String str : strings) {
            if (customers.isEmpty()) {
                customers.put(str, 1);
            } else {
                boolean CHECKVALUE = customers.get(str) == null;
                if (CHECKVALUE) {
                    customers.put(str, 1);
                } else {
                    customers.put(str, (customers.get(str) + 1));
                }
            }
        }
    }

    private static void display(HashMap<String, Integer> customers) {
        Set<String> keys = customers.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
